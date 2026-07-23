import java.util.Scanner;

public class Binarysearch {
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
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("Element found : " + arr[mid]);
                return;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println("Element not found");
    }
}
