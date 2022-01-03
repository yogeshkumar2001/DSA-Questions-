import java.util.*;

public class bubbleSort {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // size of array
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        bubbleSort(arr);
        display(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1 - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void display(int[] arr) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// public static void main(String[] args) throws Exception {
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = scn.nextInt();
// }
// bubbleSort(arr);
// print(arr);
// }