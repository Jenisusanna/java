import java.util.Scanner;
public class Biggest 
{
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("");
        x = s.nextInt();
        System.out.print("");
        y = s.nextInt();
        System.out.print("");
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println(x);
        }
        else if(y > z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
 
    }
}