package Codeforces;

import java.util.*;

public class Codeforces_1859B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            long min = Long.MAX_VALUE;
            ArrayList<ArrayList<Long>> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ArrayList<Long> arr = new ArrayList<>();
                int m = sc.nextInt();
                for (int j = 0; j < m; j++) {
                    arr.add(sc.nextLong());
                }
                Collections.sort(arr);
                min = Math.min(min, arr.get(0));
                sum+=arr.get(1);
                list.add(arr);
            }
            
            System.out.println(solve(sum, list, min));
        }
    }
    
    static long solve(long sum, ArrayList<ArrayList<Long>> list, long min){
        
        long max = Long.MIN_VALUE;
        for(int i = 0; i<list.size(); i++){
            max = Math.max(max, min+sum - list.get(i).get(1));
        }
        
        return max;
    }

}
