package practice;

import java.util.Scanner;

public class Armstrong {
	int count=0;
	public static int length(int num) {
		for(int i=0;i<=num;i++) {
			
			num=num/10;
			count++;
		}
		return count;
			
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter num");
	int num=sc.nextInt();
	int lennum=length(num);
	int temp=num;
	int res=0;
	
	
	
	while(num>0) {
		//int lennum=length(num);
		int rem=num%10;
		res+=(int)Math.pow(res, lennum);
		num/=10;
	}
	if(res==temp) {
		System.out.println("armstrong");
	}
	else {
		System.out.println("not armstrong");
	}
}
}
