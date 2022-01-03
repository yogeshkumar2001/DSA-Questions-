import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Sort(arr);
        display(arr);
    }

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}