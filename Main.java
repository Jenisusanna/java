import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
int a;
Scanner s=new Scanner(System.in);
System.out.println();
a=s.nextInt();
if(a>0)
{
System.out.println(" positive");
}
else if(a<0)
{
System.out.println(" negative");
}
else
{
System.out.println(" zero");
}
}
}
