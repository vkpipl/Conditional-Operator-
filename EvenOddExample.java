import java.util.*;
class EvenOddExample
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number which you want to check the given number is even or odd");
int num=sc.nextInt();
if(num%2==0)
{
System.out.println("The numbers is Even");
}
else
{
System.out.println("The number is Odd");
}
}
}
