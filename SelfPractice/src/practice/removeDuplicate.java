package practice;

public class removeDuplicate {
public static void main(String[] args) {
	String s="aaadfghhhhh";
	char[]a=s.toCharArray();
	for(int i=0;i<a.length;i++) {
		int c=0;
		for(int j=i+i;j<a.length;j++) {
			if(a[i]!=a[j]) {
				c++;
			}
		}
	if(c>=2) {
			System.out.println(a[i]);
		}
	}
}
}
