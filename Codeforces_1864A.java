
package Codeforces;
import java.util.*;
public class Codeforces_1864A {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt(),
                    y = sc.nextInt(),
                    n = sc.nextInt();
            int[] list = new int[n];
            list[n-1] = y;
            int k = 1;
            for(int i = n-2; i>=0; i--){
                y-=k;
                list[i]=y;
                k++;
            }
            
            if(list[0]>=x){
                list[0]=x;
                for (Integer integer : list) {
                    System.out.print(integer+" ");
                    
                }
                System.out.println();
            }else{
                System.out.println("-1");
            }
            
        }
    }
    
}
