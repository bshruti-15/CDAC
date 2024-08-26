class Q26 { 
public static void main(String[] args) { 
int number = 5; 
switch(number) { 
case 5: 
System.out.println("Number is 5"); 
break; 
case 5: 
System.out.println("This is another case 5"); 
break; 
default: 
System.out.println("This is the default case"); 
} 
} 
} 


//output


C:\Users\CSH\Desktop\C DAC\Assignment 2>javac Q26.java
Q26.java:8: error: duplicate case label
case 5:
^
1 error