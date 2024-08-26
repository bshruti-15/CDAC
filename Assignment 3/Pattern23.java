public class Pattern23 {
 public static void printPattern(int n)
    {
        int i, j, row=5;
        for (i = 1; i <= 5 ; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 4;
        printPattern(4);
    }
}


//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Pattern23.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Pattern23
11111
22222
33333
44444
55555