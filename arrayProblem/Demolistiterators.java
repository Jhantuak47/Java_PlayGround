package in.problem.array;

import java.util.ArrayList;
import java.util.ListIterator;
public class Demolistiterators {
		
	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("ravi");
		mylist.add("summit");
		mylist.add("sonu");
		mylist.add("piyush");
		mylist.add("deepak");
		
		ListIterator<String> list = mylist.listIterator();
		while(list.hasNext()) {
			System.out.print(list.next()+" ");
		}
		
		System.out.println();
		while(list.hasPrevious()) {
			System.out.print(list.previous()+" ");
		}
		
		
	}
}
