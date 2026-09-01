package searchsort;
import java.util.*;
public class arr {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
        	 for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
        	 System.out.println();}
        
    for(int i=0;i<3;i++){
   	 for(int j=0;j<3;j++){
   		   if(i==j)
           System.out.print(arr[i][j]+" ");
   		   else
   			System.out.print("  "); 
       }
   	 System.out.println();}
    for(int i=0;i<3;i++){
      	 for(int j=0;j<3;j++){
      		   if(i==1)
              System.out.print(arr[i][j]+" ");
      		   else
      			System.out.print("  "); 
          }
      	 System.out.println();}
    for(int i=0;i<3;i++){
      	 for(int j=0;j<3;j++){
      		   if(1==j)
              System.out.print(arr[i][j]+" ");
      		   else
      			System.out.print("  "); 
          }
      	 System.out.println();}
   
    for(int i=0;i<3;i++){
      	 for(int j=0;j<3;j++){
      		   if(i+j==2)
              System.out.print(arr[i][j]+" ");
      		   else
      			System.out.print("  "); 
          }
      	 System.out.println();}}
}