import java.io.*;
class TestSwitch{
	
	public static void main(String args[]){
		int a,b,c;
		System.out.println("Enter your choise:");
		System.out.println("Press 1 for adding , press 2 for subtraction:");
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		a=Integer.parseInt(br.readLine());
		switch(a)
		{
			case 1:
			System.out.println("Enter two number:");
			b=Integer.parseInt(br.readLine());
			c=Integer.parseInt(br.readLine());
			a=b+c;
			System.out.println("Sum = "+a);
			break;
			case 2:
			System.out.println("Enter two number:");
			b=Integer.parseInt(br.readLine());
			c=Integer.parseInt(br.readLine());
			a=b+c;
			System.out.println("Sum = "+a);
			break;
			default:
			System.out.println("invalid entry:");
		}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}