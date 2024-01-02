import java.util.*;
class FactorialExample
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a non negative number");
int num=sc.nextInt();
long fact=1;
if(num>0)
{
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial of  "+num+" is "+fact);
}
}
}
