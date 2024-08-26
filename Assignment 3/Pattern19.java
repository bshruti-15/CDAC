public class Pattern19 {
public static void printPattern(int n)
{
int i, j;
for (i = 1; i <= n; i++) {
for (j = 1; j <= i; j++) {
System.out.print(j +"*");
}
System.out.println();
}
}
public static void main(String args[])
{
int n = 5;
 printPattern(n);
    }
}


//output


C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Pattern19.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Pattern19
1*
1*2*
1*2*3*
1*2*3*4*
1*2*3*4*5*