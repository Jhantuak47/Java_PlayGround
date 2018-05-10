import java.util.*;
import java.text.*;
class importdate
{
  public static void main(String args[])
	{
   	   Date date=new Date();
	 /* String d=date.toString();
	
	System.out.println("current date:"+d);
	System.out.println("current date using string="+d);*/

	   SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/YYYY");
	System.out.println("todays date is:"+date2.format(date));
	String d= new String();
	String temp=null;
	d=date2.format(date);

	System.out.print("printing again the date is:"+d);
	int i,count=0;
	
	for(i=0;i<d.length();i++)
		{
		   if(d.charAt(i)=='/')
			{
			   count++;
				if(count==2)
				   {
					temp=d.substring(i+1);
				   }
			}	
		}
	System.out.println("\ncurrent date:"+temp);

       }
}