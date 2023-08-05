
package Codeforces;

import java.util.Scanner;


public class Codeforces_1849A {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            System.out.println(solve());
        }
    }
    
    public static int solve(){
        int b = sc.nextInt();
        int c = sc.nextInt();
        int h = sc.nextInt();
        
        if(b <= c+h) {
            return b + (b-1);
        }
        return (2*(c+h)) + 1;
        
    }
    
}
