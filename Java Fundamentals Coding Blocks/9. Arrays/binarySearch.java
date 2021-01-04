
import java.util.Scanner;

public class binarySearch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] ags) {
        int[] array = takeInput();
        System.out.println("Enter an item: ");
        int item = sc.nextInt();
        System.out.println(binarySearch(array,item));
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

     public static int binarySearch(int[] arr,  int item) {
         int lo=0, hi = arr.length - 1;
        while(lo <= hi) {
            int mid = (lo+hi)/2;

            if(arr[mid] < item) {
                lo = mid + 1;
            } else if(arr[mid] > item) {
                hi = mid - 1;
                }else {
                    return mid;
                }
            }
        return -1;
    }
}


