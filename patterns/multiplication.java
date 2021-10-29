import java.util.*;

public class multiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        // write your code here
        int fans = 0;
        int carry = 0;
        int p = 1;
        int ans2 = 0;
        while (n2 > 0) {
            int ln2 = n2 % 10;
            n2 /= 10;

            int newn1 = n1;
            while (newn1 > 0) {
                int ln1 = newn1 % 10;
                
                int ans1 = ln2 * ln1 + carry;
                
                carry = ans1 / b;
                ans1 %= b;
                
                ans2 = ans2 + ans1 * p;
                
                p *= 10;
                newn1 /= 10;


            }
            p = 1;
            fans = ans2;
            p*=10;

        }

        return fans;
    }

}