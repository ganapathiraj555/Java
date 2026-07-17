import java.util.Scanner;
public class Vowelandcons
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                System.out.println("Vowel is:" + ch);
            }
            else
            {
                System.out.println("Consonant is:" + ch);
            }
        }
        else
        {
            System.out.println("Not an alphabet");
        }
    }
}