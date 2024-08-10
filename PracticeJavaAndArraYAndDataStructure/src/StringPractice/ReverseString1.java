package StringPractice;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverse("rarp"));
	}
 static String reverse(String string) {
		char[]a=string.toCharArray();
		int i=0,j=a.length-1;
		while(i<j) {
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
		i++;
		j--;
		
		//return string;
	
		return new String(a);}
		return string;
	}

}
