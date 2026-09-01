package searchsort;
import java.util.*;
public class rootsquare {
	 public static void main(String []args){
		  Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		  List<Integer> l= new ArrayList<>();
		    for(int i=0;i<n;i++) {
		    	l.add(sc.nextInt());
		    }
		   System.out.print(l);
		   System.out.println();
		   System.out.print("[");
		   
		   for(int i=0;i<n;i++) {
			   if(l.get(i)==1) {
				   System.out.print("1 1 ");   
			   }
			   else if(l.get(i)%2==0) {
				   int k=l.get(i);
				   System.out.print(k+" "+k*k+" ");
			   }
			   else {
				   int k=l.get(i);
				   System.out.print(k+" "+(int)Math.sqrt(k)+" ");
			   }
			   
		   }
		   System.out.println("]");
		   sc.close();}}