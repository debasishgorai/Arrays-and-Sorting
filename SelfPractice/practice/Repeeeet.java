package practice;

public class Repeeeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="aasssd";
int count =0;
for(int i=0;i<s.length();i++) {
	for(int j=0;j<s.length();j++) {
		if(i==j)continue;
		if(s.charAt(i)!=s.charAt(j)) {
			count++;
		}
	}
	\\System.out.println(count);


}
