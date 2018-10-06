import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println();
n=s.nextInt();
if(n>0)
{
System.out.println("the number is positive");
}
else if(n<0)
{
System.out.println("the number is negative");
}
else
{
System.out.println("the number is zero");
}
}
}
