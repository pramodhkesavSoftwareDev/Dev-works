public class SelectionSort {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SelectionSort sort =new SelectionSort();
         
        int a[] ={56,91,35,72,48,68};
        Selection(a);
            for(int i=0;i<a.length;i++){
            System.out.println("Sorted values");    
                System.out.println(a[i]);
            }
    }
 
    private static void Selection(int[] a) {
        int i,j,k,min;
        int n=a.length;
        for(i=0;i<n-1;i++) {
            min=a[i];
            for(j=i+1;j<n;j++) {
                if(a[j]<min){
                min=a[j];
                a[j]=a[i];
                a[i]=min;
            }
        }
         
    }   
}
}