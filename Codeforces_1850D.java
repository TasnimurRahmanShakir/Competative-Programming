package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Codeforces_1850D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a.add(sc.nextInt());
            }

            Collections.sort(a);
            //System.out.println(a);
            int cnt = 1, y=1;
            for (int j = 1; j < n; j++) {
                if ((a.get(j) - a.get(j - 1) <= k)) {
                    cnt++;
                   
                }else{
                    y = Math.max(y, cnt);
                    cnt = 1;
                }
                 
            }
            y = Math.max(y, cnt);
            //System.out.println(y);
            
            int count = 1,x=1;
            
            Collections.sort(a,Collections.reverseOrder());
            //System.out.println(a);
            for (int j = 1; j < n; j++) {
                if ((a.get(j-1) - a.get(j) <= k)) {
                    count++;
                }
                else{
                     x = Math.max(x, count);
                    count = 1;
                }
               
            }
            x = Math.max(x, count);
            //System.out.println(x);
            
            System.out.println(Math.min((n-x), n-y));
        }

    }
}
