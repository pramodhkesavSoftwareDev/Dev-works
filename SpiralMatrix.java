public class SpiralMatrix {
 
    public static void main(String[] args) {
         
int[][] a=new int[4][4];
int i=1,j=0,k=0;  
 
for(k=0;k<a[j].length;k++) {
a[j][k]=i;
i++;                                 /* a[0][0]=i;i++; a[0][1]=i;i++; a[0][2]=i;i++;a[0][3]=i;i++; */
}
k--;
 
while(j<a[k].length-1) {
j++;
                                            /*  a[1][3]=i;i++; a[2][3]=i;i++;a[3][3]=i;i++;*/
a[j][k]=i;
i++;
}
k--;
 
while(k>j-3) {
a[j][k]=i;i++;                            /*a[3][2]=i;i++; a[3][1]=i;i++ */
k--;
}
 
for(j=3;j>k;j--) {
     
        a[j][k]=i;i++;                   /*a[3][0]=i;i++;a[2][0]=i;i++;a[1][0]=i;i++;*/
    }
 
  j++;
   
    for(k=1;k<a[j].length-1;k++) {
          
    a[j][k]=i;i++;     //a[1][1]=i;i++;a[1][2]=i;i++;a[2][2]=i;i++;a[2][1]=i;i++;
         }
         k--;
         a[k][k]=i;i++;
         a[k][j]=i;i++;
         
     
for( int row=0;row<a.length;row++) {
for(int col=0;col<a[row].length;col++) {
    System.out.print(a[row][col]+"  ");
     
}
System.out.println();
}
}