import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int v : arr ){
            if(v != 0 ){
            map.put(v, map.getOrDefault(v , 0) + 1);
            }
        }
        // System.out.println(map);
        for(int i=0;i<arr.length;i++){
            int db= 2*arr[i];
            if(map.containsKey(db)){
                if(map.get(arr[i]) > 1){
                    int of = map.get(arr[i]);
                    int nf = of-1;
                    map.put(arr[i] ,  nf);
                }else{
                    map.remove(arr[i]);
                }
                
                if(map.get(db) > 1){
                    int of = map.get(db);
                    int nf = of-1;
                    map.put(db ,  nf);
                }else{
                    map.remove(db);
                }
            }
        }  
        
        if(map.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}