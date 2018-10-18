import java.util.Scanner;

public class Alphabet
{
    public static void main(String args[])
    {
    	
        char ab;
        Scanner scan = new Scanner(System.in);
		
       
        System.out.print(" ");
        ab = scan.next().charAt(0);
		
       
        if((ab>='a' && ch<='z') || (ab>='A' && ch<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("No" );
        }
    }
}
