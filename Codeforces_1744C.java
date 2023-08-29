
package Codeforces;

import java.util.Scanner;

public class Codeforces_1744C {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char ch = sc.next().charAt(0);
            String s = sc.next();
            s += s.substring(0, s.indexOf("g")+1);
            
            int max = Integer.MIN_VALUE, cnt = -1;
            boolean check = false;
            for(int i = 0; i<s.length(); i++){
                if(!check && s.charAt(i) == ch){
                    check = true;
                }
                if(check){
                    cnt++;
                }
                
                if(check && s.charAt(i)=='g'){
                    max = Math.max(max, cnt);
                    cnt = -1;
                    check = false;
                }
            }
            
            System.out.println(max);
        }
    }
    
}
