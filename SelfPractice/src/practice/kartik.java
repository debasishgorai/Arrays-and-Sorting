package practice;

public class kartik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="akash";
String temp="";
String res="";
int f=0;
int l=0;
if(s.length()%2==0)  f=s.length()/2;
else f=s.length()/2;
l=f+1;
System.out.println(f);
System.out.println(l);
for(int i=0;i<=s.length()-1;i++) {
	if(i==f||i==l)continue;
	temp+=s.charAt(i);
}
res=s.charAt(l)+temp+s.charAt(f);
System.out.println(res);

	
	}


}
