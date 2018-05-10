package in.problem.array;

public class mergesort {
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
}
