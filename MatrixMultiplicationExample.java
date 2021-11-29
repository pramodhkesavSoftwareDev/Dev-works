public class MatrixMultiplicationExample{  
public static void main(String args[]){  
//creating two matrices    
int [][] firstmatrix={{1,1,1},{2,2,2},{3,3,3}};    
int [][] secondmatrix={{1,1,1},{2,2,2},{3,3,3}};    
     
//creating another matrix to store the multiplication of two matrices    
int Thirdmatrix[][]=new int[3][3];  //3 rows and 3 columns  
 
    System.out.println("Matrix Multiplication");
 
//multiplying and printing multiplication of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
Thirdmatrix[i][j]=0;      
for(int k=0;k<3;k++)      
{      
Thirdmatrix[i][j]+=firstmatrix[i][k]*secondmatrix[k][j];      
}//end of k loop  
System.out.print(Thirdmatrix[i][j]+"    ");  //printing matrix element  //use tab for space
}//end of j loop  
System.out.println();//new line    
}    
}}  
/*
Output:
Matrix Multiplication
6	6	6	
12	12	12	
18	18	18	*/