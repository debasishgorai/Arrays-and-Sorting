package practice;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aasssiiidjhoopu";
		char[]a=s.toCharArray();
		int count =0;
		for(int i=0;i<s.length();i++) {
			boolean flag=true;
			for(int j=0;j<=s.length()-1;j++) {
				if(i==j)continue;
				else if(a[i]==a[j]) {
					flag=false;
				}
			}
			if(flag) {
				count++;
			}
		}
		
	
	
	System.out.println(count);
	
	
	
	
	
	}
}
