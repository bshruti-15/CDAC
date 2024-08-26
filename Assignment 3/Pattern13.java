class Pattern13{
 public static void main(String args[]){
for(int i=1;i<=5;i++)
{
for(int j=1;j<i;j++)
{
 System.out.print(i + "*");
 }
System.out.println(i);
}
for(int i=4;i>=1;i--)
{
for(int j=1;j<i;j++)
{
System.out.print(i + "*");
}
System.out.println(i);
 }
 }
}


//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Pattern13.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Pattern13
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1        