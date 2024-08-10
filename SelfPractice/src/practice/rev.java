package practice;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(rev("sf#gg_@555"));
	}

	private static String rev(String s) {
		char[]a=s.toCharArray();
		int i=0;
		int j=a.length-1;
		while(i<j) {
			char c=s.charAt(i);
			if(!IsAlphabet(a[i])) {
				i++;
			}
			 if(!IsAlphabet(a[j])) {
				j--;
			}
			else {
				char temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		return new String(a);
	}

	private static boolean IsAlphabet(char c) {
		// TODO Au0.to-generated method stub
		return Character.isLetterOrDigit(c);
	
	}
}
