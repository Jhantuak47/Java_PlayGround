import java.io.*;
class TestPerfectNumb{
	
	public static void main(String args[])throws IOException{
			
			int result=0,x=0;
			System.out.println("enter any number:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			x= Integer.parseInt(br.readLine());
			for( int i=1;i<=x/2;i++){
				
				if(x%i==0)
					result = result+i;
			}
			if(result==x)
				System.out.println("yes "+x+" is a perfect no.");
			else
				System.out.println("No "+x+" not a perfect no. hense result is "+result);
	}
}

	