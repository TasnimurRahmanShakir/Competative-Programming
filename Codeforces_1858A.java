
package Codeforces;

import java.util.Scanner;


public class Codeforces_1858A {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt(),
                    b = sc.nextInt(), 
                    c = sc.nextInt();
            
            if(c%2==0){
                System.out.println(b>=a?"Second":"First");
            }else{
                System.out.println(a>=b?"First":"Second");
            }
        }
    }
    
}
