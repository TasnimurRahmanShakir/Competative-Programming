package Codeforces;

import java.util.Scanner;

public class Codeforces_820A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(),
                v0 = sc.nextInt(),
                v1 = sc.nextInt(),
                a = sc.nextInt(),
                l = sc.nextInt();
        int r = 0,
                day = 0;

        while (true) {
            if (v0 + (day * a) <= v1) {
                r += v0 + (day * a);
            } else {
                r += v1;
            }

            if (day >= 1) {
                r -= l;
            }
            day++;
            if (r >= c) {
                System.out.println(day);
                break;
            }

        }
    }

}
