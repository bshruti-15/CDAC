class Q5{  
public static void main(String args[])  
{    
 int a1=1,a2=2,a3,i,count=7;    
 System.out.print(a1+" "+a2);  
for(i=2;i<count;++i)    
 {    
  a3=a1+a2;    
  System.out.print(" "+a3);    
  a1=a2;    
  a2=a3;    
 }    
  
}
}  

//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Q5.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Q5
1 2 3 5 8 13 21