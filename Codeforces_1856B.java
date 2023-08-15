package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces_1856B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Long> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextLong());
            }

            long sum = 0, cnt=0;
            if (n == 1) {
                System.out.println("NO");
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i)==1){
                        cnt++;
                    }else{
                        sum += (list.get(i)-1);
                    }

                }
                
                System.out.println(sum>=cnt?"YES":"NO");
                
            }
        }
    }

}
