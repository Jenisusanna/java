import java.util.Scanner;
class Main
{
  public static void main(String args[])
{ 
  int i,j=1;  
  int n;
  Scanner s=new Scanner(System.in);
  System.out.println(" ");  
  n=s.nextInt();
  for(i=1;i<=n;i++)
  {    
      j=j*i;  
   }  
   System.out.println(j);   
 }  
}  
