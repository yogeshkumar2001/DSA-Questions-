import java.util.*;

public class Sort012With3Pointers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        sort(arr);
        display(arr);

    }
    public static void sort(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, k);
                k--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}