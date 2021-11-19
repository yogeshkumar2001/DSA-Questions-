import java.util.*;

public class targetSumTriplet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();

        Arrays.sort(arr); // nlogn

        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            int ntar = tar-arr[i];
            while (j < k) {
                if (arr[j] + arr[k] > ntar) {
                    k--;
                } else if (arr[j] + arr[k] < ntar) {
                    j++;
                } else {
                    System.out.println(arr[i] + " " + arr[k] + " " + arr[j]);
                    j++;
                    k--;
                }
            }
        }

    }

}