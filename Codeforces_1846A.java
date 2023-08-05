
package Codeforces;

import java.util.Scanner;


public class Codeforces_1846A {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-->0){
            solve();
        }
    }
    public static void solve(){
        int n = sc.nextInt();
        int cnt = 0;
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a>b)cnt++;
        }
        System.out.println(cnt);
    }
    
}
