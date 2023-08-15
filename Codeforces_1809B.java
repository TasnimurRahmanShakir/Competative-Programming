package Codeforces;

import java.util.*;

public class Codeforces_1809B {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long l = 0, h =  (long) 1e9;
            while(l<=h){
                long mid = (l+h)/2;
                if((mid+1)*(mid+1) >= n){
                    h = mid-1;
                }else{
                    l = mid+1;
                }
            }
            System.out.println(l);
        }
    }

}
