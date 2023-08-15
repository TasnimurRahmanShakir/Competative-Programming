package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces_474B {

    public static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> list1 = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        int last = 0;
        for (int i = 0; i < n; i++) {
            input.add(sc.nextInt());
            list.add(last+1);
            list1.add(last+input.get(i));
            last += input.get(i);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int init = 0;
            int end = n-1;
            while (init <= end) {
                int mid = (init + end) / 2;
                if(list.get(mid) <= x && list1.get(mid)>=x){
                    System.out.println(mid+1);
                    break;
                }
                if(x > list.get(mid)){
                    init = mid+1;
                }else{
                    end = mid - 1;
                }

            }
             

        }

    }

}
