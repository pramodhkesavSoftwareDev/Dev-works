public class Recursion {
 
    public static void main(String[] args) {
         
Recursion rec =new Recursion();
int result=rec.fact(5);
int result2=rec.addition(5);
}
private int addition(int i) {
        // TODO Auto-generated method stub
        if(i==1) {
            return 1;
        }
        return i+addition(i-1);
    }
 
    private int fact(int no) {
        // TODO Auto-generated method stub
        if(no==1) {
            return no;
        }
        return no*fact(no-1);
         
    }
}