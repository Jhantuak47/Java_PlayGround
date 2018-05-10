package in.problem.array;

	public class Demomerge {

		public static void main(String args[]) {
			int ch,end,start;
			
			int[] x=new int[] {20,4,19,8,0,1};
			System.out.print("INPUTED ARRAY::");
			
			for(int j=0;j<x.length;j++)
				System.out.print(x[j]+" ");
			
			mergesort.mergesort1(x);
			
			System.out.print("\nAFTER SORTING::");
			
			for(int j=0;j<x.length;j++)
				
				System.out.print(x[j]+" ");
				//System.out.println();
		}	
	}
