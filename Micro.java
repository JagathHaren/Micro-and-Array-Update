
package myproject;

import java.util.Scanner;

public class Micro {

       public static void main(String[] args) {
    	   int tst,n,K;
    	   int[] a;
    	   Scanner sc=new Scanner(System.in);
    	   tst=sc.nextInt();
    	   int s[] =new int[tst];
    	   for(int i=0;i<tst;i++)
    	   {
    		   int c=0,f=0;
    		   n=sc.nextInt();
    		   K=sc.nextInt();
    		   a=new int[n];
    		  for(int j=0;j<n;j++)
    			  a[j]=sc.nextInt();
    		 
    		 while(f==0) 
    		 { 
    	      f=1;
    		  for(int j=0;j<n;j++)
    		  {
    			  if(a[j]<K)
    			  {
    				  a[j]=a[j]+1;
    				  f=0;
    			  }
    		  }
    	   
    		  if(f==0)
    			  c++;
    		 }
    		 
    		 s[i]=c;
      	   }
    	   for(int i=0;i<s.length;i++)
    		   System.out.println(s[i]);
           sc.close();
       }
}

	
