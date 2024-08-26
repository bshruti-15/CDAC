class Q7 
 {
static int findSum(int number)  
{     
int sum = 0;  
while (number != 0)  
{      
sum = sum + number % 10;  
number = number/10;  
}  
return sum;  
}  
public static void main(String args[])  
{  
int number = 9876;    
System.out.println("The sum of digits: "+findSum(number));
}  
}   


//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Q7.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Q7
The sum of digits: 30 





	