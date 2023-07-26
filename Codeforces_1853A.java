package Codeforces;

import java.util.*;

public class Codeforces_1853A {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<Integer> IntList(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        return a;

    }

    public static ArrayList<String> StrList(int n) {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.next());
        }
        return a;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve());

        }
    }

    public static int solve() {
        int n = sc.nextInt();
        ArrayList<Integer> a = IntList(n);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (a.get(i) > a.get(i + 1)) {
                return 0;
            } else {
                min = Math.min(min, a.get(i + 1) - a.get(i));
            }

        }
        
        if(min == 0) {
            return 1;
        }
        return min/2+1;

    }

}
