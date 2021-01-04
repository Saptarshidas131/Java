import java.util.Scanner;

public class insertionSort {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] ags) {
        int[] array = takeInput();
        insertionSort(array);
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

    public static void insertionSort(int[] arr) {
        for(int counter = 1; counter <= arr.length-1; counter++) {
            int val = arr[counter];
            int j = counter - 1;
            while(j>=0 && arr[j]>val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
    }
}
