public class Recursion {
 
    public static void main(String[] args) {
         
Recursion rec =new Recursion();
rec.display();
}
public void display(String name, int len)
        {
        if(len>0)
        {
            System.out.println(name.substring(0, len));
            len--; 
            display(name,len);
             
        }
}
}