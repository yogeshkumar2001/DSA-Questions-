// 19
// 50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n 

import java.util.*;
import java.io.*;
public class Main{
    public static class Node{
        int data;
        Node left;
        Node right;
    }
    public static class Pair{
        Node node;
        int state;
    }

    public static Node construct(Integer arr[]){
        Stack<Pair> stack = new Stack<>();

        Node root = new Node();
        root.data = arr[0];

        Pair rootp = new Pair();
        rootp.node = root;
        rootp.state= 1;

        stack.push(rootp);
        int idx = 1;


        while(stack.size() > 0){
            Pair peekp = stack.peek();

            if(peekp.state == 1){
                if(arr[idx] != null){
                    Node lc = new Node();
                    lc.data= arr[idx];
                    peekp.node.left = lc;

                    Pair lp = new Pair();
                    lp.node=lc;
                    lp.state=1;
                    stack.push(lp); 
                }
                peekp.state++;
                idx++;
            }else if(peekp.state==2){
                    if(arr[idx] != null){
                    Node rc = new Node();
                    rc.data = arr[idx];
                    peekp.node.right = rc;

                    Pair rp = new Pair();
                    rp.node = rc;
                    rp.state=1;

                    stack.push(rp);
                    }
                    peekp.state++;
                    idx++;
            }else{
                stack.pop();
            }
        } 
        return root;
    }
    public static void display(Node node){
        if(node == null){
            return;
        }
        String str = "<--" + node.data +"-->";
        String lchild = node.left ==null?  "." : node.left.data +"";
        String rchild = node.right ==null ?"." : node.right.data +"";
        System.out.println(lchild+str+rchild);

        display(node.left);
        display(node.right);
    }
    public static int size(Node node){
        if(node==null){
            return 0 ;
        }
        int lsize = size(node.left);
        int rsize = size(node.right);

        return lsize+rsize+1;
    }
    public static int sum(Node node){
        if(node == null){
            return 0;
        }
        int lsum = sum(node.left);
        int rsum = sum(node.right);

        return lsum+rsum+node.data;

    }
    public static int max(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        
     int max=node.data;

        int lmax = max(node.left);
        int rmax = max(node.right);

        max = Math.max(max , Math.max(lmax,rmax));

        return max;


    }
    public static int height(Node node){
        if(node == null) return -1;

        int lh=height(node.left);
        int rh=height(node.right);

        return Math.max(lh,rh)+1;
    }
   public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);
        // display(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
}
