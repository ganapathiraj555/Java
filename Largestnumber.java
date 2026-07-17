import java.util.Scanner;
public class Largestnumber
{
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        System.out.println("Enter c value");
        int c=sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println("Largest number is:"+a);
        }
        else if(b>=a&&b>=c){
            System.out.println("Largest number is:"+b);
        }
            else{
                System.out.println("Largest number is:"+c);
            }
        }}