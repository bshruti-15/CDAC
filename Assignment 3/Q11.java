public class Q11 {
public static void main(String[] args) {
int num1 = 15, num2 = 25;
int postNum = num1--;
int preNum = --num2; 
System.out.println("postNum = " + postNum);
System.out.println("num1 = " + num1);
System.out.println("preNum = " + preNum);
System.out.println("num2 = " + num2);
}
}

//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Q11.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Q11
postNum = 15
num1 = 14
preNum = 24
num2 = 24