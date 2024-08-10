package practice;

public class onecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,0,1,1,0,1};

System.out.println(ctu(a,a.length-1));
	
}

	private static int ctu(int[] a,int size) {
		int left=0;
		int right=a.length-1;
		for(int i=0;i<a.length;i++) {
		while(left<right) {
		while(a[i]==0 & left<right) {
				left++;
				right--;
			}
				while(a[i]==1 & left<right ) {
					left--;
					right++;
				}
			  if (left < right)  
	            { 
	                a[left] = 0; 
	                a[right] = 1; 
	                left++; 
	                right--; 
	            } 
			}
		}
		
		return 1;
	}

	

}
