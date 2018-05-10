import java.util.*;
class SumofDigits{
	
	public static void main(String args[]){
		int n,r=0,sum = 0,num;
		System.out.println("enter your number:");
		Scanner sc = new Scanner(System.in);
		num=n =sc.nextInt();
		while(n!=0){
			r=n%10;
			n=n/10;
			sum = sum+r;
		}
		System.out.println("sum of digits = "+sum);
		System.out.println("Reverse of digits = "+getReverseNumb(num));
	}
	private static int getReverseNumb(int n){
		
		int sum =0,r=0;
			while(n!=0){
			r=n%10;
			n=n/10;
			sum = sum*10+r;
					System.out.println("sum of digits = "+sum);
		}
		return sum;
	}
}