
package Codeforces;

import java.util.*;
public class Codeforces_1476A {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong(),
                    k = sc.nextLong();
            
            if(n==k){
                System.out.println("1"); 
            }else if(n < k){
                System.out.println(k%n==0?(k/n):(k/n)+1);
            }else{
                long x = n%k==0?n/k:(n/k)+1;
                k *= x;
                System.out.println(k%n==0?(k/n):(k/n)+1);
            }
        }
    }
    
    
    
}
