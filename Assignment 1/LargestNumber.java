public class LargestNumber 
{  
public static void main(String[] args)   
{    
int a=40, b=60, c=19;  
if(a>=b && a>=c)  
System.out.println(a+" is the largest Number");    
else if (b>=a && b>=c)  
System.out.println(b+" is the largest Number");  
else  
System.out.println(c+" is the largest number");  
}  
} 

//output

C:\Users\CSH\Desktop\Aug24\Assignment 1>javac LargestNumber.java

C:\Users\CSH\Desktop\Aug24\Assignment 1>java LargestNumber
60 is the largest Number