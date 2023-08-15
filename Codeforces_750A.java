package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces_750A {

    public static void main(String[] args) {
        int time = 240;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),
                k = sc.nextInt();
        int x = 0;
        ArrayList<Integer>list = new ArrayList<>();
        list.add(0);
        for (int i = 1; i <= n; i++) {
            x += (5*i);
            list.add(x);
            
        }
        int avl = 240 - k;
        int cnt = 0;
        for(int i = 1; i<=n; i++){
            if(avl < list.get(i)){
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }

}
