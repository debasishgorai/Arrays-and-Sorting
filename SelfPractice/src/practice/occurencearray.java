package practice;

public class occurencearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,2,7};

for(int i=0;i<=a.length-1;i++) {
	int k=0;
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
		k++;
		}
	}
	System.out.println(a[i]+" "+k);
}
	}

}
