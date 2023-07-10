package ArraysAndSorts;

import java.util.Scanner;

public class RotateTheElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter length of array");
   int n=sc.nextInt();
   System.out.println("Enter Elements");
   int[]a=new int[n];
   for(int i=0;i<n;i++)
   {
	   a[i]=sc.nextInt();
   }
   System.out.println("From Where");
   int m=sc.nextInt();
    int [] l=new int[m];
    
    for(int i=0;i<l.length;i++)
    {
    	l[i]=a[i];
    }
    System.arraycopy(a, m, a, 0, n-m);
    System.arraycopy(l, 0, a, n-m, l.length);
   
    System.out.println("=================================");
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
    
    
    
    
   
	   
	}

}
