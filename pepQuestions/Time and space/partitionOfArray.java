import java.util.*;

public class partitionOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();  //partiton element 

        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            } else {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}
