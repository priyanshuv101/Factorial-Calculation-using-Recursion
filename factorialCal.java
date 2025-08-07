import java.util.*;
class factorialCal
{
public static long fact(int n)
{
if(n==0 || n==1)
{
return 1;
}
else
{
return n*fact(n-1);
}
}
public static void main(String str[])
{
int x;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
x=sc.nextInt();
if(x<0)
{
System.out.println("Factorial is not defined for negative number.");
}
else
{
long result=fact(x);
System.out.println("factorial of "+x+" is: "+result);
}
}
}
