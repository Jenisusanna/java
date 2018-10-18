import java.util.Scanner;

public class Alphabet
{
    public static void main(String args[])
    {
    	
        char j;
        Scanner scan = new Scanner(System.in);
		
       
        System.out.print(" ");
        j = scan.next().charAt(0);
		
       
        if((j>='a' && j<='z') || (j>='A' && j<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("No" );
        }
    }
}
