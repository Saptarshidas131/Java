
import java.util.Scanner;

public class linearSearch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] ags) {
        int[] array = takeInput();
        System.out.println("Enter an item: ");
        int item = sc.nextInt();
        System.out.println(linearSearch(array,item));
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

     public static int linearSearch(int[] arr,  int item) {
        for(int i=0;i<arr.length; i++) {
            if(arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}


