package practice;

public class JyotiILoveYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//rajesh jyoti ke potei de 
			int jyoti=5;
			int jyotirgud=1;
			
			while(jyoti>0)
				//rahul bc boli de
			{
				for(int i=1;i<=jyotirgud;i++) 
					//sex kormu ,oyo jamu koto sopno
					System.out.print("*");
				
				jyoti-=jyotirgud;
				jyotirgud++;
				
				if(jyoti-jyotirgud < jyotirgud+1) 
					
					jyotirgud=jyoti;
				System.out.println();
			}
		}

	
	

}
