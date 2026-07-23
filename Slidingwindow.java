import java.util.Scanner;

public class Slidingwindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Enter the window size: ");
        int k = sc.nextInt();
        if (k > s.length() || k <= 0) {
            System.out.println("Invalid window size");
            return;
        }
                for (int i = 0; i <= s.length() - k; i++) {
            String window = s.substring(i, i + k);
            System.out.println(window);
        }
        sc.close();
    }
}