package demo;

import java.util.Scanner;

public class Swap_nos_untill_given_place_using_for
{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
				for(int i=0;i<n-m;i+=m) {
					for(int j=i,k=i+m-1;j<k;j++,k--) {
						int temp=arr[j];
						arr[j]=arr[k];
					    arr[k]=temp;
				}}
				for(int i=0;i<n;i++) {
					System.out.print(arr[i]+" ");
				}
				sc.close();
				
		}
		
	}
	