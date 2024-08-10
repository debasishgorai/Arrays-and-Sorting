package practice;

public class duplicate {
public static void main(String[] args) {
	String s="ramm";
	char[]c=s.toCharArray();
	for(int i=0;i<=c.length-1;i++) {
		int count=0;
		for(int j=i+1;j<c.length;j++) {
			
		if(s[i]!=s[j]) {
			
			count++;
		}
			
		}
	
	
	if(count>=1) {
		System.out.println(s[i]);
		
	}
}}
}
