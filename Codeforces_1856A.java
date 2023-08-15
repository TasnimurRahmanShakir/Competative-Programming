package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces_1856A {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int cnt = 0;
            for(int i = 0; i<n-1; i++){
                if(list.get(i)>list.get(i+1)){
                    cnt = Math.max(list.get(i), cnt);
                }
            }
            
            System.out.println(cnt);

        }
    }

}
