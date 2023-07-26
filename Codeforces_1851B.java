package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Codeforces_1851B {

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

    
    public static String solve() {
        int n = sc.nextInt();
        ArrayList<Integer> a = IntList(n);
        ArrayList<Integer> b = (ArrayList) a.clone();;
        Collections.sort(b);
        for(int i =0; i<n; i++){
            if(a.get(i)%2 != b.get(i)%2){
                return "NO";
            }
        }
        
        return "YES";
    }

}
