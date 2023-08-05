
package Codechef;

import java.util.Scanner;

public class Mario_and_the_Broken_String {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            String str = sc.next();
            
            if(str.substring(0, n/2).equals(str.substring(n/2))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
    }
    
}
