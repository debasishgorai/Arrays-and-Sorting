package practice;

public class Pattern3 {
public static void main(String[] args) {
	int n=4;
	int [][]a=new int[n][n];
	int s=1;
	int i=0;
	int j=0;
	char dir='D';
	while(j<a.length-1) {
		switch(dir) {
		case 'D':{
			a[i][j]=s++;
			i++;
			if(i==a.length-1) { 
				dir='U';
				
				j++;
				i--;
				
			}
		} break;
			case 'U':{
				a[i][j]=s++;
				i--;
				if(i==j) {
					j++;
					dir='D';
				}
			}
		}
		}
	for(int[] n1:a) {
		for(int  n2:n1) {
			if(n2!=0) {
				System.out.print(n2+" ");
			}
			System.out.println();
		}
	}
	}
	
}

