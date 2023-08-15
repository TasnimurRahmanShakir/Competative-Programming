
package Codeforces;
import java.util.*;
public class Codeforces_412A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), 
                k = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
        
        int x = Math.abs(n-k);
        if(x>=k){
            for(int i = k; i>1; i--){
                System.out.println("LEFT");
            }
            for(int i = 0; i<n; i++){
                System.out.println("PRINT "+s.charAt(i));
                if(i!=n-1){
                    System.out.println("RIGHT");
                }
            }
            
        }else{
            for(int i = k; i<n; i++){
                System.out.println("RIGHT");
            }
            for(int i = n-1; i>=0; i--){
                System.out.println("PRINT "+s.charAt(i));
                if(i!=0){
                    System.out.println("LEFT");
                }
            }
            
        }
        
        
    }
    
}
