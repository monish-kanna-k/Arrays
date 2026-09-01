package searchsort;
import java.util.*;
public class binarysearch{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			
		}
		int k=sc.nextInt();
		int start=0;
		int end=ar.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(ar[mid]==k) {
				System.out.println(mid);
				sc.close();
				return;
			}
			else if(ar[mid]<k) {
				start = mid+1;
			}
			else if(ar[mid]>k) {
				end=mid-1;
			}
		}
		System.out.println(-1);
		sc.close();
		}
	}