
package Codeforces;

import java.util.Scanner;


public class Codeforces_1845A {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       int t = sc.nextInt();
       while(t-->0){
           int n = sc.nextInt(),
               k = sc.nextInt(),
               x = sc.nextInt();
           if(x == 1 && (k==1 || (k==2 && n%2==1))){
               System.out.println("NO");
           }else{
               if(x!= 1){
                   System.out.println("YES");
                   System.out.println(n);
                   for(int i = 0; i<n; i++) {
                       System.out.print(1+ " ");
                   }
                   System.out.println();
               }else{
                   System.out.println("YES");
                   System.out.println(n/2);
                   for(int i = n%2; i<n/2; i++){
                       System.out.print(2+" ");
                   }
                   System.out.println(n%2==0?"":"3");
               }
           }
       }
    }
    
}
