package searchsort;
import java.util.*;
public class linearsearch{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			
		}
		boolean flag=false;
		int ans=0;
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(ar[i]==m) {
				ans=i;
				flag = true;
			}
		}
		if(flag) {
			System.out.println(ans);
			
		}
		else {
			System.out.println("-1");
		}
		sc.close();
	}
	
}