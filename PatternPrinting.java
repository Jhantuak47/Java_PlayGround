import java.util.*;
class PatternPrinting{
	
	public static void main(String args[]){
		int i,j,n;
		System.out.print("enter the value:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1;i<=n;i++){
			for(int k=n;k>i;k--){System.out.print(" ");}
			for(j=1;j<=i;j++){
			System.out.print(""+j);				
			}
			System.out.println();
		}
		for(i=1;i<=n;i++){
			for(int k=n;k>i;k--){System.out.print(" ");}
			for(j=1;j<=i;j++){
			System.out.print(""+j);				
			}
			int p = i-1;
			for(int l =1;l<=i-1;l++){
			System.out.print(" "+p);
			p--;
			}	
			System.out.println();
		}
	}
}