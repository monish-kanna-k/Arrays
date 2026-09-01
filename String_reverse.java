package demo;

import java.util.Scanner;

public class String_reverse
{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String  s=sc.nextLine();
		char a[]=s.toCharArray();
		int i=0,j=s.length()-1;
		
		while(i<j) 
		{
			
			if(a[i]==' ') {
				i++;
			}
			else if(a[j]==' ') {
				j--;
			}
			else {
				char ch=a[i];
				a[i]=a[j];
				a[j]=ch;
				i++;
				j--;
				
			}
			
		}
		for(int m=0;m<a.length;m++) {
			System.out.print(a[m]);
		}
		sc.close();
		
		}
	}