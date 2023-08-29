
package Codeforces;
import java.util.*;
public class Codeforces_1725B {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
                
        ArrayList<Long>list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(sc.nextLong());
        }
        Collections.sort(list,Collections.reverseOrder());
        long ans = 0, need;
        for(int i = 0; i<list.size(); i++){
            //System.out.println(list.get(i));
            need = (d/list.get(i))+1L;
            if(need>n) {
                break;
            }
            ans ++;
            n -= need;
        }
        System.out.println(ans);
    }
    
}
