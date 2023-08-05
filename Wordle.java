package Codechef;

import java.util.Scanner;

public class Wordle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            String M = "";
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    M = M + 'G';
                } else {
                    M = M + 'B';
                }
            }
            System.out.println(M);
        }
    }

}
