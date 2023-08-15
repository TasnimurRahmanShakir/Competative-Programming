package Codeforces;
import java.util.Scanner;
 
public class Sol
{
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]= new int[1000001];
    int k=1;
    int l=0;
    for(int i=0;i<n;i++){
        int temp=sc.nextInt()+l;
        for(;l<temp;l++){
            ar[l]=k;
        }
        k++;
    }
    for(int a:ar){
        System.out.print(a);
    }
    StringBuffer sb = new StringBuffer();
    int m=sc.nextInt();
    for(int i=0;i<m;i++){
      sb.append(ar[sc.nextInt()-1]+"\n");
    }
    // sc.close();
    System.out.println(sb);
    sc.close();
	}
}
