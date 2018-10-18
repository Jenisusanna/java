import java.util.*;
 
public class Vowel
{
    public static void main(String []s)
    {
        char ch;
         
      
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter Alphabets: ");
        ch=sc.next().charAt(0);
         
        if( (ch>='A' && ch<='Z') || ch>='a' && ch<='z')
        {
            switch(ch)
            {
                    
                    case 'a':case 'e':case 'i':case 'o':case 'u':
                    case 'A':case 'E':case 'I':case 'O':case 'U':
                        System.out.println("vowel");
                    break;
                     
                    
                    default:
                        System.out.println("Consonant");
                    break;
            }
        }       
        else
        {
            System.out.println("invalid");
        }
         
    }
}