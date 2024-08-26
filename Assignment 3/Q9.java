public class Q9
{
public static void main(String args[])
{
int i=1,j=1,max=8;
System.out.print(" 4825: ");
while(j>0)
  {
j=i%8;
if(8>max)
{
max=8;
 }
 j=j/8;
  }
System.out.println("Largest digit: "+max);
    }
}


//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Q9.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Q9
 4825: Largest digit: 8