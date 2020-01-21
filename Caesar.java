import java.util.Scanner;
import java.util.InputMismatchException;

class Caesar
{
    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the caesar shift number : ");
            int num = input.nextInt();
            if(num<=0 || num>27)
            {
                System.out.println("Enter a valid number!!");
                return;
            }

            String text="";
            input.nextLine();
            System.out.print("Enter the plain text : ");
            text = input.nextLine();
            //System.out.println(text);

            StringBuffer result= new StringBuffer(); 
            //int len = text.length();
            //System.out.println(len);
            for (int i=0; i<text.length(); i++) 
            { 
                if(Character.isDigit(text.charAt(i)))
                {
                    char n = text.charAt(i);
                    result.append(n);
                    continue;
                }
                if(text.charAt(i)==' ')
                {
                    result.append(' ');
                    continue;
                }
                if (Character.isUpperCase(text.charAt(i))) 
                { 
                    char ch = (char)(((int)text.charAt(i) + num - 65) % 26 + 65); 
                    result.append(ch); 
                } 
                else
                { 
                    char ch = (char)(((int)text.charAt(i) + num - 97) % 26 + 97); 
                    result.append(ch); 
                } 
            } 
            System.out.println("Cipher text : "+result);
            return;
        }
        
        catch(InputMismatchException e)
        {
            System.out.println("Please enter valid data type");
        }
    }
}