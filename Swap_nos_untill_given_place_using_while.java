package demo;

import java.util.Scanner;

public class Swap_nos_untill_given_place_using_while
{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
	    int i=0;
	    while(i<n-m) {
					for(int j=i,k=i+m-1;j<k;j++,k--) {
						int temp=arr[j];
						arr[j]=arr[k];
					    arr[k]=temp;
				    }i+=m;
		}
				    
				for(int l=0;l<n;l++) {
					System.out.print(arr[l]+" ");
				}
			sc.close();
		}

	}
	