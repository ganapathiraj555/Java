import java.util.Scanner;
public class Arraycount
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Print array elements");
	for(int i=0;i<n;i++){
	    System.out.println(arr[i] + " ");
	}
	int evencount=0,oddcount=0;
for (int i=0;i<n;i++){
    if (arr[i]%2==0){
        evencount=evencount+1;
    }
    else{
        oddcount=oddcount+1;
    }
    }
    System.out.println("Even count : " + evencount);
	System.out.println("Odd count : " + oddcount);
	    
	}
}
