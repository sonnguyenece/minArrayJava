import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input array length : ");
        int length = scn.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input " + (i + 1) + " element: ");
            arr[i] = scn.nextInt();
        }

        int min = arr[0];
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (min >= arr[i]) min = arr[i];
        }
        System.out.print("Min in array : "+min);
    }
}
