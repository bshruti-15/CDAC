public class Pattern12 {
 public static void printPattern(int n)
    {
        int i, j, row=5;
        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 4; j++) {
                System.out.print("*");
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

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Pattern12.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Pattern12
*****
*****
*****
*****
*****