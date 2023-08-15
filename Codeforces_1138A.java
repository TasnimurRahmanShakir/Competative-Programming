package Codeforces;

import java.util.*;

public class Codeforces_1138A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int cnt1 = 0, cnt2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            //list.add(x);
            if (x == 1) {
                if (cnt2 > 0) {
                    list.add(cnt2);
                }

                cnt2 = 0;
                cnt1++;
            }
            if (x == 2) {
                if (cnt1 > 0) {
                    list.add(cnt1);
                }
                cnt1 = 0;
                cnt2++;

            }
        }
        if (cnt2 > 0) {
            list.add(cnt2);
        }
        if (cnt1 > 0) {
            list.add(cnt1);
        }
        //System.out.println(list);
        for(int i = 0; i<list.size()-1; i++){
            min = Math.min(list.get(i), list.get(i+1));
            max = Math.max(max, min);
        }
        System.out.println(max*2);
    }

}
