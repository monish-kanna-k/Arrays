package searchsort;
import java.util.*;
public class numtostr {
	 public static void main(String []args){
    String once[]= {"","one","two","three","four","five","six","seven","eight","nine"};
    String tens[]= {"","ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    String eleven[]= {"","eleven","twelve","thirteen","fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>10 && n<20) {
    	System.out.println(eleven[n-10]);
    	sc.close();
        return ;
        }
    else if(n<10) {
        System.out.println(once[n]);

    }
    else if(n>=20&&n<100) {
    System.out.println(tens[n/10]+" "+once[n%10]);
    }
    else if(n%100==0) {
    	System.out.println(once[n/100]+" hundred ");
    }
    else if(n>=100) {
    	int rem=n%100;
    	if(rem>10 &&rem<20)
        	System.out.println(once[n/100]+" hundred and "+eleven[rem%10]);
    	else
    	System.out.println(once[n/100]+" hundred and "+tens[rem/10]+" "+once[n%10]);
    }
    
    
    sc.close();
 }
    
    
    }