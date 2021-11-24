public class InsertionSort {

	public static void main(String[] args) {
	
		InsertionSort bsort=new InsertionSort();
		int a[] ={34,8,64,51,32,21};
		Insertion(a);
			for(int i=0;i<a.length;i++){
			System.out.println("Sorted values");	
				System.out.println(a[i]);
			}
		}

	private static void Insertion(int[] a) {
		
		int j,p,temp;
		int n=a.length;
		for(p=1;p<n;p++) {
			temp=a[p];
			for(j=p;j>0&&a[j-1]>temp;j--) {
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
		
	}
	
	}