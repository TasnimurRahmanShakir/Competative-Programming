
package Codeforces;

import java.util.*;


public class Codeforces_1849B {

    public static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            solve();
        }
    }
    public static void solve(){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][2];
        
        for(int i = 0; i<n; i++){
            arr[i][0] = sc.nextInt() %k;
            arr[i][1] = i+1;
            if(arr[i][0] == 0){
                arr[i][0] = Integer.MAX_VALUE;
            }
            
        }
        Arrays.sort(arr,(i, j) -> j[0] - i[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][1]+" ");
            
        }
        System.out.println();
        
               
    }
   
    
}
