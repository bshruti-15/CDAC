class Q13 { 
public static void main(String[] args) { 
String str = null; 
System.out.println(str.length()); 
    } 
} 



//output

C:\Users\CSH\Desktop\C DAC\Assignment 2>javac Q13.java

C:\Users\CSH\Desktop\C DAC\Assignment 2>java Q13
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at Q13.main(Q13.java:4)