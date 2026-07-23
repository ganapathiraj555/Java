import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Read n elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter key element to search: ");
        int key = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index: " + i);
                return;
            }
        }
        
        System.out.println("Key not found");
    }
}
