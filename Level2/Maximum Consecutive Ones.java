
import java.util.*;

class MaximumConsecutiveOnes {
  public static void main (String[] args) {
    // Scanner scn = new Scanner (System.in);
    // int n = scn.nextInt();
    // int [] arr =  new int[n];
    // for (int i = 0; i < n ; i++) {
    //   arr[i] =  scn.nextInt();
    // }
     int [] arr={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};

    int tlen = 0;
    int mlen = 0;
    
    for(int i=0;i<arr.length;i++){
        int val = arr[i];
        
        if(val==0){
         
            tlen=0;
        }else{
            tlen++;
            mlen= Math.max(tlen,mlen);
            
        }
   
    }
    // mlen= Math.max(tlen,mlen);
    System.out.println(mlen);
  }
}