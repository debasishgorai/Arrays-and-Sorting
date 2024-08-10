package practice;

public class orderofoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="rameoo";
String s1="";
while(s.length()>0) {
	char c=s.charAt(0);
	s1=s.replace(c+"", "");
	int count=s.length()-s1.length();
	//char c=s.charAt(i);
	

	System.out.println(c+""+count);
	s=s1;
}

	}
}
