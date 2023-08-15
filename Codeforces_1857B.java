package Codeforces;

import java.util.Scanner;

public class Codeforces_1857B {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String m = sc.next();
            StringBuilder sr = new StringBuilder(m);
            sr.reverse();
            sr.append('0');
            int y = 0;
            for (int i = 0; i < sr.length() - 1; i++) {
                if (sr.charAt(i) > '4') {
                    sr.setCharAt(i + 1, (char) (sr.charAt(i + 1) + 1));
                    for (int k = i; k >= y; k--) {
                        
                        sr.setCharAt(k, '0');
                    }
                    y = i;
                }
            }
            sr.reverse();
            int b = 0;
            if (sr.charAt(0) == '0') {
                b++;
            }
            for (int i = b; i < sr.length(); i++) {
                System.out.print(sr.charAt(i));
            }
            System.out.println();
        }
    }

}
