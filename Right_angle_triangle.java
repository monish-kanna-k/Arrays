package demo;

import java.util.Scanner;

public class Right_angle_triangle
{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j;
		for(int i=1;i<n+1;i++){
			for(j=0;j<n-i;j++) {
			System.out.print("  ");
			}
			int l=i;
			for(int k=0;k<n-j;k++) {
				System.out.print(l+" ");
				l++;}
			
			for(int m=l-2;m>=i;m--) {
				System.out.print(m+" ");
			}
			System.out.println("");
			}
		sc.close();
		
	}
}