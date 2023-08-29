package Codeforces;

import java.util.*;

public class Codeforces_1862B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            ArrayList<Long> list = new ArrayList<>();
            for (long i = 0; i < n; i++) {
                list.add(sc.nextLong());
            }
            ArrayList<Long> list1 = new ArrayList<>();
            list1.add(list.get(0));
            for (long i = 1; i < list.size(); i++) {
                if (list.get((int) i) < list.get((int) (i - 1))) {
                    list1.add( list.get((int) i));
                }
                list1.add(list.get((int) i));
            }
            System.out.println(list1.size());
            for (Long x : list1) {
                System.out.print(x + " ");
            }
            System.out.println();

        }

    }

}
