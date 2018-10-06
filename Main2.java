import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) 
	{

        Scanner r = new Scanner(System.in);

        System.out.println();
        int a = r.nextInt();

        if(a>0&&a% 2 == 0)
            System.out.println( "even");
        else if(a%2!=0)
            System.out.println("odd");
            else 
            System.out.println("invalid");
    }
}
