import java.util.Scanner; 
public class BinarySearch {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
int [] ar= {10,20,30,40,50,60,80,100,120,130};
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int key=sc.nextInt();
int s=0,e=ar.length-1;
while(s<=e) {
    int m=(s+e)/2;
    if(key==ar[m]) {
        System.out.println("Found key at position :"+m);
        break;
    }
    else if(key<ar[m]) {
        e=m-1;
    }
    else
    {
        s=m+1;
    }
    if(s>e) {
        System.out.println("Number not found in the array");
    }
}
}
}