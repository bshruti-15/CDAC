class Q4 {
public static void main(String[] args) {
int num = 1234, reversed = 0;
while(num != 0) {
int digit = num % 10;
 reversed = reversed * 10 + digit;
 num /= 10;
 }
System.out.println("Reversed Number: " + reversed);
  }
}

//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Q4.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Q4
Reversed Number: 4321