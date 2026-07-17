import java.util.Scanner;
public class Swapnumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		System.out.println("Before swap of a:"+a);
		System.out.println("Before swap of b:"+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swap of a:"+a);
		System.out.println("After swap of b:"+b);
	}
}