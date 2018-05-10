import java.util.*;
class TestFibo{
	
	public static void main(String args[]){
		int f=0;
		int x[]=new int[10];
		for(int i=0;i<9;i++)
			x[i]=-1;
		System.out.println("enter no of sequence:");
		Scanner sc = new Scanner(System.in);
		f = sc.nextInt();
		System.out.print("0 1");
		new TestFibo().fibonacciseries(f,x);
		//System.out.println("TN:-"+new TestFibo().getTriangleNumb(f));
		
	}
		private int fibonacciseries( int n,int[] x){
			if(n==0||n==1){
				x[n]=n;
				return x[n];
			}
			if(x[n]!=-1)
				return x[n];
			else{
				x[n]= (fibonacciseries(n-2,x))+(fibonacciseries(n-1,x));
				System.out.print(" "+x[n]);
				return x[n];
			}
		}
		
		private int getTriangleNumb(int n){
			System.out.println("Method"+n);
			if(n==1){
				System.out.println("Return 1");
			return 1;
			}
			else{
				int result = n+getTriangleNumb(n-1);
				System.out.println(" Return"+result+" : "+n+" + getTn("+n+"-1)");
				return result;
			}
			
		}
}