package practice;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="aaddjhll";
String res="";
            int i=0;
            
           while(i<s.length()) {
        	   char c=s.charAt(i);
        	   int count=1;
        	   if(s.charAt(i)==c&&i<s.length()) {
        		   i++;
        		   count++;
        	   }
        	   
        	   System.out.println(c+" "+count);
           }
          // System.out.println(c+""+count);
	}

}
