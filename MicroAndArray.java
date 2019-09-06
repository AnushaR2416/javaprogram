/*Micro purchased an array A having N integer values. After playing it for a while, he got
bored of it and decided to update value of its element. In one second he can increase
value of each array element by 1. He wants each array element's value to become greater
than or equal to K. Please help Micro to find out the minimum amount of time it will take,
for him to do so.*/


package microAndArrayUpdate;
import java.util.*;
public class MicroAndArray {
	public static void main(String args[]) {
		int T,K,N,NT,m=0;
		int a[]=new int[10];
		int b[]=new int[10];
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		for(int i=0;i<T;i++) {
			N= sc.nextInt();
			K=sc.nextInt();
			for(int j=0;j<N;j++) {
				a[j]=sc.nextInt();
			}
			int min=a[0];
			for(int j=0;j<N;j++) {
				if(a[j]<min)
					min=a[j];
			}
			NT=K-min;
			if(min<K) {
				b[m]=NT;
				m++;
			}
			else{
				b[m]=0;
			}
			
		}
		for(int i=0;i<T;i++) {
			System.out.println(b[i]);
		}
		sc.close();
	}
	
}
