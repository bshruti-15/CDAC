public class Pattern15 
{    
public static void main(String args[])   
{      
int i, j, row = 5;       
for (i=0; i<row; i++)   
{       
for (j=row-i; j>1; j--)   
{   
System.out.print(" ");   
}    
for (j=0; j<=i; j++ )   
{        
System.out.print("* ");   
}   
System.out.println();   
}   
}   
}  

//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Pattern15.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Pattern15
    *
   * *
  * * *
 * * * *
* * * * *