package StringPractice;

public class ArrayList {
private Object[]a= new Object[5];
private int count=0;
public void add(Object ele) {
	a[count]=ele; increase();
	
	count++;
}
private void increase() {
	 Object[]temp= new Object[a.length+3];	// TODO Auto-generated method stub
	
	System.arraycopy(a, 0, temp, 0, a.length);
	a=temp;
}
public void add(Object ele,int index) {
	if(index<=-1|| index>=size()) {
		throw new IndexOutOfBoundsException();
	}
	for(int i=size()-1;i>=index;i--) {
		a[i+1]=a[i]; 
		
		
		
	}
	
	
}
private int size() {
	// TODO Auto-generated method stub
	return count;
}
public int get() {

	
	int index;
	if(index<=-1|| index>=size()) {
		throw new IndexOutOfBoundsException();
}

	


}
