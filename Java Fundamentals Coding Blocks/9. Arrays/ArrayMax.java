import java.util.Scanner;

public class ArrayMax {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] ags) {
        int[] array = takeInput();
        System.out.println(maxInArray(array));
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

    public static int maxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
