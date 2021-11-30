import java.util.Scanner;
public class SemesterTask {
 
 
             Scanner sc = new Scanner(System.in);
              
            public static void main(String[] args) {
                // TODO Auto-generated method stub
                SemesterTask task = new SemesterTask();
                int [] [] arr = task.Semester();
                task.EnterMarks(arr);
 
            }
 
            private void EnterMarks(int[][] a) {
             
                 for (int i = 0; i < a.length; i++)
                 {
                      for (int j = 0; j < a[i].length; j++) 
                       {
                        System.out.println("Enter Semester" + (i + 1)  + " Subject"+ (j+1)+ " mark") ;
                        a[i][j] = sc.nextInt();
                        }
                    }
                  
                 System.out.println();
                 System.out.println("Total no of marks");
                 System.out.println("Jagged array");
                 for (int i = 0; i < a.length; i++)
                 {
                      for (int j = 0; j < a[i].length; j++) 
                       {
                          System.out.print(a[i][j]+"    "); 
                        }
                      System.out.println();
                    }
                 }
 
 
            private int[][] Semester() {
                // TODO Auto-generated method stub
            System.out.println("Enter the Number of Semester");
             
            int Sem =   sc.nextInt();
            int [] [] a = new int [Sem] [0] ;
 
            for(int i=0;i<a.length;i++)
            {
                System.out.println("Enter no of Subjects in Semester"+(i+1));
                a[i]= new int [sc.nextInt()];
            }
            return a;
            }
       }