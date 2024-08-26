public class Pattern26  
{              
public static void main(String[] args)   
{  
int i, j, k = 1;   
for (i = 1; i <= 5; i++)   
{  
for (j = 1; j< i + 1; j++)   
{  
System.out.print(k+++ " ");  
}   
System.out.println();  
}  
}  
}  


//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Pattern26.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Pattern26
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15