
package Codeforces;

import java.util.Scanner;


public class Codeforces_1796A {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            String s = sc.next();
            String fb = "";
            
            int cnt = 1;
            while(fb.length() <100){
                if(cnt%3==0) {
                    fb += "F";
                }
                if(cnt%5==0) {
                    fb+= "B";
                }
                cnt++;
            }
            
            solve(fb,s);
        }
    }
    public static void solve(String fb, String s){
        //System.out.println(fb);
        if(fb.contains(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
