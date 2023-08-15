
package Codeforces;

import java.util.*;
public class Codeforces_299B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),
                k = sc.nextInt();
        
        String s = sc.next();
        
        int max = 0, cnt = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i)=='#'){
                cnt++;
            }else{
                max = Math.max(cnt, max);
                cnt=0;
            }
        }
        
        
        System.out.println(max>=k?"NO":"YES");
    }
    
}
