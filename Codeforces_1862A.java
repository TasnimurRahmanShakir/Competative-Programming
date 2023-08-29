package Codeforces;

import java.util.*;

public class Codeforces_1862A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        char[] vika = {'v', 'i', 'k', 'a'};
        while (t-- > 0) {
            ArrayList<String> list = new ArrayList<>();
            int n = sc.nextInt(),
                    m = sc.nextInt();
            for(int i = 0; i<n; i++){
                list.add(sc.next());
            }
            int count = 0, x = 0;
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    if(list.get(j).charAt(i)==vika[x]){
                        x++;
                        count++;
                        break;
                    }
                }
                if(count==4){
                    break;
                }
            }
            System.out.println(count==4?"YES":"NO");
        }
    }

}
