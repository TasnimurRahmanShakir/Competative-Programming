package Codeforces;

import java.util.*;

public class Codeforces_1848A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int x = sc.nextInt();
            int y = sc.nextInt();
            int f = 0;
            for (int i = 0; i < k; i++) {
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();

                int sum = (x + x1) + (y + y1);
                if (sum % 2 == 0) {
                    f=1;
                }
            }
            if(f==0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}
