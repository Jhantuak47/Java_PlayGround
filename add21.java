import java.io.*;
class add420
{ 
  public static void main(String args[])throws IOException
   {
	int a,b,c,sum=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter two numbers:");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	sum=a+b;
	System.out.println("sum="+sum);
   }
}