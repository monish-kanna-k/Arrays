package searchsort;
import java.util.*;
public class listclockwise {
	 public static void main(String []args){
		  Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		  List<Integer> l= new ArrayList<>();
		    for(int i=0;i<n;i++) {
		    	l.add(sc.nextInt());
		    }
		   System.out.print(l);
		   System.out.print("");
		   int m=sc.nextInt();
		   for(int i=0;i<m;i++) {
			   int num =l.get(l.size()-1);
			   l.remove(l.size()-1);
			   l.add(0,num);
			   
		   }
		   System.out.print(l);
		   System.out.print("");
		   int k=sc.nextInt();
		   for(int i=0;i<k;i++) {
			   int num =l.get(0);
			   l.remove(0);
			   l.add(l.size(),num);
			   
		   }
		   System.out.print(l);
		    sc.close();
	 }}