import java.util.Scanner;

public class Array_io {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] ags) {
        int[] array = takeInput();
        display(array);
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

    public static void display(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
