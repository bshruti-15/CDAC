class Q6
{  
public static void main(String[] args)   
{  
int a=0,n=0,i=1,j=1;  
while(n<5)  
{  
j=1;  
a=0;  
while(j<=i)  
{  
if(i%j==0)  
a++;  
j++;   
}  
if(a==2)  
{  
System.out.printf("%d ",i);  
n++;  
}  
i++;  
}  
}  
}  


//output


C:\Users\CSH\Desktop\C DAC\Assignment 3>javac Q6.java

C:\Users\CSH\Desktop\C DAC\Assignment 3>java Q6
2 3 5 7 11