import java.util.Scanner;
public class OddorEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int N = sc.nextInt();
        if(N%2==0){
            System.out.println("Even number is :"+N);
        }
        else{
            System.out.println("Odd number is :"+N);
        }
	}
}