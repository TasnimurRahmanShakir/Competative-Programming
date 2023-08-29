package Codeforces;

import java.util.*;

public class Codeforces_1860A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if(s.equals("()")){
                System.out.println("NO");
                continue;
            }
            System.out.println("Yes");
            String a = "()".repeat(s.length());
            String b = "(".repeat(s.length()) + ")".repeat(s.length());
            if (b.contains(s)) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }

        }
    }

}
