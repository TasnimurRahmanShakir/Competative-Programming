
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces_1851A {

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
        while(t-- >0){
            System.out.println(solve());
        }
    }
    
    public static int solve(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int H = sc.nextInt();
        int cnt = 0;
        ArrayList<Integer> a = IntList(n);
        for(int i = 0; i<n; i++){
            int dif = Math.abs(a.get(i)-H);
            if(dif%k == 0 && (dif/k < m) && dif != 0) {
                cnt++;
            }
        }
        return cnt;
    }
    
}
