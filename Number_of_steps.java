package HackerEarth;
import java.util.Scanner;

public class Number_of_steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        
        int count = 0;
        int mi = getMin(a);
        int i = 0;
        while (i < n) {
            if (a[i] >= b[i]) {
                while (a[i] > mi) {
                    a[i] -= b[i];
                    count++;
                }
            }
            if (a[i] < mi) {
                mi = a[i];
                i = 0;
            }
            if (a[i] != mi) {
                count = -1;
                break;
            }
            i++;
        }
        
        System.out.println(count);
    }
    
    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
