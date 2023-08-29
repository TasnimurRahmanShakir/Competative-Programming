
package Codeforces;
import java.util.*;
public class Codeforces_195A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
                b = sc.nextInt(),
                c = sc.nextInt();
        int ans = (a*c)-(c*b);
        System.out.println(ans%b==0?ans/b:(ans/b)+1);
    }
    
}
