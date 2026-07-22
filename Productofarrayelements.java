import java.util.Scanner;

public class Productofarrayelements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int product = 1;
        for (int i = 0; i < n; i++) {
            product = product * arr[i];
        }

        System.out.println("Product of array elements: " + product);

        sc.close();
    }
}