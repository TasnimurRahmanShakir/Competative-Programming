package Codeforces;

import java.util.*;

public class Codeforces_1845B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while (t-- > 0) {
            int x1, y1, x2, y2, x3, y3, c = 1;
            x1 = s.nextInt();
            y1 = s.nextInt();
            x2 = s.nextInt();
            y2 = s.nextInt();
            x3 = s.nextInt();
            y3 = s.nextInt();
            if ((x2 > x1 && x3 > x1)) {
                c += Math.min(x2, x3) - x1;
            } else if (x2 < x1 && x3 < x1) {
                c += x1 - Math.max(x2, x3);
            }
            if ((y2 > y1 && y3 > y1)) {
                c += Math.min(y2, y3) - y1;
            } else if (y2 < y1 && y3 < y1) {
                c += y1 - Math.max(y2, y3);
            }
            System.out.println(c);
        }
        s.close();
    }
}
