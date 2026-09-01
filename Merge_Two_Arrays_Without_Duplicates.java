package demo;


import java.util.Scanner;

public class Merge_Two_Arrays_Without_Duplicates
{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int m=sc.nextInt();
		int ar[]=new int[m];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			ar[i]=sc.nextInt();
		}	
		int a[]=new int[m+n];
		int c=0;
		int counts[]=new int[100]; 
		for(int i=0;i<n;i++) {
			
			if(counts[arr[i]]==0) {
				counts[arr[i]]++;
				a[c++]=arr[i];
			}}
		for(int i=0;i<m;i++) {
			if(counts[ar[i]]==0) {
				counts[ar[i]]++;
				a[c++]=ar[i];
				
			}
		}
		
		for(int i=0;i<100-1;i++) {
		    if(counts[i]!=0) {
			System.out.print(i+" ");
		}}

		sc.close();
		}
}