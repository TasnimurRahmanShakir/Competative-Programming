package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces_1857A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int even = 0, odd = 0;
            if (n == 1) {
                System.out.println("NO");
            } else {
                for (int i = 0; i < n; i++) {
                    if (list.get(i) % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                }

                if ((odd % 2 == 0) || odd == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

}
