import java.util.*;
class TestArray{
	
	public static void main(String args[]){
		//new TestArray().testArrayOfString();
		new TestArray().testArrayList();
	}
	private void testArrayOfString(){
		String[] arrayString = new String[] {"madrash","delhi","Ahmedabad","clcutta","Bombay"};
		//coppying array of string using array class...
		String[] copyStrings =Arrays.copyOf(arrayString,arrayString.length);
		System.out.println("coppyed array....");
		for(String str : copyStrings)
			System.out.print(str+" ");
		System.out.println("\nSorted array....");
		Arrays.sort(copyStrings);
		for(String str : copyStrings)
			System.out.print(str+" ");
		System.out.println("\nElement found at possition "+(Arrays.binarySearch(copyStrings,"clcutta")+1));		
	}
	private void testArrayList(){
		
		ArrayList <String> mylist = new ArrayList<>();
		mylist.add("piyush");
		mylist.add("sumit");mylist.add("jhantu");mylist.add("raunak");
		ListIterator list = mylist.listIterator();
		while(list.hasNext()){
			System.out.println(list.next()+" " );
		}
		System.out.println("reverse order...");
		while(list.hasPrevious()){
			System.out.println(list.previous()+" " );
		}
	}
}