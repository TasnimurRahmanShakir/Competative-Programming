
package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Codeforces_1857C {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer>list = new ArrayList<>();
            for(int i = 0;i<(n*(n-1))/2;i++ ){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            ArrayList<Integer>b = new ArrayList<>();
            int jump = n-1;
            for(int i = 0; jump>0;){
                
                //System.err.println(i);
                b.add(list.get(i));
                
                i += jump;
                jump--;
            }
            b.add(Collections.max(list));
            for(Integer a:b){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    
}
