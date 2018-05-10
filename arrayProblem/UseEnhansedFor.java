package in.problem.array;

	public class UseEnhansedFor {
	
		public static void main(String[] args) {
			
			double[] ablist = {1.2,1.4,1.5,4.5,6.7};
			
			System.out.println("INPUTED ARRAY:");
			for(double var : ablist) {//using enhansed for loop
				System.out.print(var +" ");
			}
			
			PrintArray(ablist);//passing array to another method within the same class...
			
			System.out.print("\nRETURNED ARRAY");
			double[] GetArray =  ReturnArray(ablist);//Returning array from another metod
			PrintArray(GetArray);
		}
		
		public static void PrintArray(double[] a) {
			
			//System.out.print("\nCATCHED ARRAY:");s
			System.out.println();
			for(double MyArray : a) {
				System.out.print(MyArray+" ");
			}
		}
		public static double[] ReturnArray(double[] a) {
			
			//return a; or
			double[] copy = new double[a.length];
			for(int i=0;i<a.length;i++) {
				copy[i] = a[i];
			}
			return copy;//returning array which has been copied from where it has been called...
		}
 }
