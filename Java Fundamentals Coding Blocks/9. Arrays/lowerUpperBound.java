
import java.util.Scanner;

public class lowerUpperBound {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] ags) {
        int[] array = takeInput();
        System.out.println("Enter an item: ");
        int item = sc.nextInt();
        System.out.println(lowerBound(array,item));
        System.out.println(upperBound(array,item));
    }

    public static int[] takeInput() {
        System.out.println("Size ?");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the value for " + i + "  index ?");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int lowerBound(int[] arr, int data){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid] == data) {
                ans = mid;
                high = mid-1;
            }else if(data < arr[mid]) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }

        return ans;
    }
    
    public static int upperBound(int[] arr, int data){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid] == data) {
                ans = mid;
                low = mid+1;
            }else if(data < arr[mid]) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }

        return ans;
    }
}


