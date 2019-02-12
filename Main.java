import java.util.Scanner;
class Main
{
  public static void main(String args[])
{
    int c=0,a,b;  
    int n;
    Scanner s =new Scanner(System.in);
    System.out.println("");
    n=s.nextInt(); 
    b=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(b==c)  
    System.out.println("yes");   
    else  
        System.out.println("no");   
   }  
}  