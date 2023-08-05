
package Codechef;

import java.util.*;
public class Lucky_Four {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            String str = sc.next();
            int cnt = 0;
            for(int i = 0;i<str.length(); i++){
                if(str.charAt(i) == '4'){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        
    }
    
}
