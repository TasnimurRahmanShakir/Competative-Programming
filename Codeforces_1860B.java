package Codeforces;

import java.util.*;

public class Codeforces_1860B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            long m = sc.nextLong(),
                    k = sc.nextLong(),
                    a = sc.nextLong(),
                    b = sc.nextLong();
            long remain = m%k;
            m -= (k*b);
            if(m<0){
                m = remain;
            }
            m -= a;
            if(m <= 0){
                System.out.println("0");
            }else{
                long ans = m / k;
                long rem = m%k;
                if(k-rem <= a && rem > 0){
                    ans++;
                }else{
                    ans += rem;
                }
                System.out.println(ans);
            }
            
            
        }
    }

}
