
package Codeforces;

import java.util.*;
public class Codeforces_1847A {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(),
                    k = sc.nextInt(),
                    x = sc.nextInt();
            int sum = 0;
            ArrayList<Integer>list = new ArrayList<>();
            for(int i = 1; i<n; i++){
                int present = sc.nextInt();
                list.add(Math.abs(x-present));
                sum+= list.get(i-1);
                x = present;
            }
            
            Collections.sort(list,Collections.reverseOrder());
            
            for(int i = 0; i<k-1; i++){
                sum-=list.get(i);
            }
            
            System.out.println(sum);
        }
    }
    
}
