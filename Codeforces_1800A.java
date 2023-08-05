
package Codeforces;

import java.util.Scanner;


public class Codeforces_1800A {

    //public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            char[] str1 = in.next().toUpperCase().toCharArray();
            String str2=str1[0]+"";
           for(int i =1;i<str1.length;i++)
           {
               if(str1[i]!=str1[i-1]) {
                   str2+=str1[i];
               }
           }
           if(str2.equals("MEOW")) {
               System.out.println("YES");
            } else {
               System.out.println("NO");
            }
        }
    }
    
    
}
