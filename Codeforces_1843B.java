
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces_1843B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long cnt = 0, sum = 0, f= 0;
            ArrayList<Integer>list = new ArrayList<>();
            for(int i = 0; i<n; i++){
                list.add(sc.nextInt());
                
                if(list.get(i) <= 0){
                    if(list.get(i)<0) {
                        list.set(i, list.get(i)*(-1));
                        f=1;
                    }
                    
                }else if(list.get(i) > 0){
                    if(f==1) {
                        cnt++;
                    }
                    f=0;
                }
                sum+=list.get(i);
            }
            if(f==1){
                cnt++;
            }
            System.out.println(sum+" "+cnt);
            
        }
    }
    
}
