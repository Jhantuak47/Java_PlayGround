package in.problem.array;

import java.util.Arrays;
public class UseArrayUtility {
			
		public static void main(String[] args) {
			
			String[] name =new String[] { "sumit","arnab","sonu","rahul","prashant" };
			//copying array using utility class...
			String[] copyname =Arrays.copyOf(name, name.length);
			
			for(String str : copyname) {
				System.out.print(str+" "); 
			}
			//initializing integer type array....
			int[] orignal = new int[] {10,9,8,7,6,5,2,1,0};
			
			System.out.println("befor sorting::");
			for(int ori : orignal) {
				System.out.print(ori+" ");
			}
			//sorting array using utility class.....
			Arrays.sort(orignal);
			System.out.println("\nAfter sorting::");
			for(int ori : orignal) {
				System.out.print(ori+" ");
			}
			
			//searching array using binary search...
			Arrays.binarySearch(orignal, 2);
			System.out.println();
			System.out.println("item is found at possition " +(Arrays.binarySearch(orignal, 9)+1));
		}
}
