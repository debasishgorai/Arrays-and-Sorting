package StringPractice;

public class ReverseEachWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="i am debasish";
char[]a=s.toCharArray();

String s1="";
int i=0;
int j=0;
while(i<a.length) {
	while(j >0 &  a[j]!=' ') {
		i--;
		
	
	//String t="";
	
	int k=i+1;
	String t="";
	while(k<=j) {
		t+=a[k];
		k++;
			
	}
	s1+=t;
	if(i>=0)
		s1+="";
	i--;
	j=i;
}
}
System.out.println(s1);
	
	//s1+=t;

	}

}
