class Pattern20{
public static void main(String args[]){
int n=5;
for(int i=5;i>0;i--){
for(int j=5;j>=i;j--){
if(j==5)
System.out.print(j);
else
System.out.print("*"+j);
}System.out.println();
}
}
}

//output

C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Pattern20.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Pattern20
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1