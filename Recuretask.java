package learning.java;
 
public class Recuretask {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Recuretask rt=new Recuretask();
         
        int num=370;
        int armNo=0;
        int num2=num;
    int armNo1= rt.repeat(num,armNo);
         
        if(num2==armNo1) {
            System.out.println("It is an Armstrong number");
        }
        else {
            System.out.println("It is not an Armstromg number");
        }
    }
 
    private int repeat(int num ,int armNo) {
        // TODO Auto-generated method stub
         
         
        int rem;
        rem =num%10;
        armNo=armNo+(rem*rem*rem);
        num=num/10;
        if(num<=0) {
            return armNo;
        }
         
        return repeat(num,armNo);
    }
     
 
}
