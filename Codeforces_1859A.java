
package Codeforces;
import java.util.*;
public class Codeforces_1859A {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>(), c = new ArrayList<>();
            for(int i = 0; i<n; i++){
                a.add(sc.nextInt());
            }
            Collections.sort(a);
            
            b.add(a.get(0));
            for(int i = 1; i<n; i++){
                if(Objects.equals(b.get(0), a.get(i))){
                    b.add(a.get(i));
                }else{
                    c.add(a.get(i));
                }
            }
            
            if(c.isEmpty()){
                System.out.println("-1");
            }else{
                System.out.println(b.size()+" "+c.size());
                for(int i = 0; i<b.size(); i++){
                    System.out.print(b.get(i)+" ");
                }
                System.out.println();
                for(int i = 0; i<c.size(); i++){
                    System.out.print(c.get(i)+" ");
                }
                System.out.println();
            }
        }
    }
    
}
