package in.problem.array;
import java.util.Scanner;

public class FindMax {
	public static int[] merge(int[] l,int[] r,int[] a) {
		//int[] a=aa;
		int nl=l.length;
		int nr=r.length;
		int i,k,j;i=k=j=0;
		while(i<nl&&j<nr) {
			if(l[i]<=r[j]) {
				a[k]=l[i];
				i++;	
			}
			else {
				a[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<nl) {
			a[k]=l[i];
			i++;k++;
		}
		while(j<nr) {
			a[k]=r[j];
			j++;k++;
		}
		return a;
	}
	public static int[] mergesort1(int[] x) {
		int n=x.length;
		int i;
		if(n<2)
			return x;
		int mid=n/2;
		int[] left=new int[mid];
		int[] right=new int[n-mid];
		for(i=0;i<mid;i++)
			left[i]=x[i];
		for(i=mid;i<n;i++)
			right[i-mid]=x[i];
		mergesort1(left);
		mergesort1(right);
		merge(left,right,x);
		return x;
		
	}
	public static int binarysearch(int[] a,int start,int end,int ch) {

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
	public static void main(String args[]) {
		int ch,end,start;
		int[] x=new int[] {10,4,9,8,0,1};
		System.out.println("INPUTED ARRAY::");
		for(int j=0;j<x.length;j++)
		System.out.print(x[j]+" ");
		x=mergesort1(x);
		System.out.println("\nAFTER SORTING::");
		for(int j=0;j<x.length;j++)
		System.out.print(x[j]+" ");
		System.out.println();
		end=x.length-1;
		start=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to search:");
		ch=sc.nextInt();
		int value=binarysearch(x,start,end,ch);
		if(value !='0'){
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" "+x[i]);
		}
		System.out.println("\nEntered value for serach="+ch+"\nIt is found at position"+(value+1));
		}
		else 
			System.out.println("SORRY..!! ITEM IS NOT FOUND:");
	}

}
