package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces_1850C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            ArrayList<String> grid = new ArrayList<>();
            int c = 8;
            for (int i = 0; i < c; i++) {
                grid.add(sc.next());
            }
            String p = "";
            for (int i = 0; i < c; i++) {
                String s = grid.get(i);
                for (int j = 0; j < s.length(); j++) {
                    if (Character.isAlphabetic(s.charAt(j))) {
                        p += s.charAt(j);
                    }
                }
            }
            System.out.println(p);
        }

    }
}
