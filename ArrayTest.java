import java.util.*;
class ArrayTest{
	
	public static void main(String args[]){
		
		int a[]=new int [10],start=0,end=0,value=0;
		System.out.println("Inputed array:");
		for(int i=0;i<a.length;i++){
			a[i]=i;
			System.out.print(a[i]+" ");
		}
		Scanner sc = new Scanner(System.in);
		//System.out.print("MAX VLUE="+new ArrayTest().getMaxValue(a));
		 
		//Searching an eliment form given array using binary search....
		System.out.println("\nEnter the element to search for:");
		value = sc.nextInt();
		start = 0;
		end = a.length;
		System.out.println("\nelement found at possition:"+(new ArrayTest().binarysearch(a,start,end,value)+1));
	}
	
	private int getMaxValue(int[] x){
		int max=x[0];
		for(int i=0;i<x.length;i++){
			if(x[i]>max)
				max=x[i];
		}
		
		return max;
	}
	
	private int binarysearch(int[] a,int start,int end,int ch) {

		 int mid=(end+start)/2;
		 if(a[mid]==ch) {
			 return mid;
		 }
		 else if(a[mid]>ch) {
			 mid=mid-1;
			mid= binarysearch(a,start,mid,ch);
		 }	 
		 else {
			 mid=mid+1;
			mid= binarysearch(a,mid,end,ch);		 
		 }
		return mid;
	}
}