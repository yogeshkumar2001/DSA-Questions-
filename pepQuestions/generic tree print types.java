import java.util.*;
import java.io.*;

public class Main {

  public static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();

    Node(int data) {
      this.data = data;
    }
  }

  public static void display(Node node) {
    String str = node.data + " --> ";
    for (Node child : node.children) {
      str += child.data + " , ";
    }
    str += ".";
    System.out.println(str);
    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int arr[]) {
    Stack<Node> stack = new Stack<>();
    Node root = null;

    for (int val : arr) {
      if (val != -1) {
        Node node = new Node(val);
        stack.push(node);
      } else {
        Node child = stack.pop();
        if (stack.size() > 0) {
          Node parent = stack.peek();
          parent.children.add(child);

        } else {
          root = child;
        }
      }
    }
    return root;
  }

  public static void levelOrder(Node root) {
    Queue<Node> q = new ArrayDeque<Node>();
    q.add(root);
    while (q.size() > 0) {
      // remove,print,add Childrens
      Node temp = q.remove();

      System.out.print(temp.data + " ");

      for (Node child : temp.children) {
        q.add(child);
      }
    }
    System.out.print(" .");
  }

  public static void levelOrderWise(Node root) {
    Queue<Node> q = new ArrayDeque<Node>();
    Queue<Node> cq = new ArrayDeque<Node>();

    q.add(root);

    while (q.size() > 0) {
      Node temp = q.remove();
      System.out.print(temp.data + " ");

      for (Node child : temp.children) {
        cq.add(child);
      }
      if (q.size() == 0) {
        q = cq;
        cq = new ArrayDeque<>();
        System.out.println(" .");
      }
    }
  }

  public static void main(String args[]) {
    // Node root = new Node(10);

    // Node twenty = new Node(20);
    // root.children.add(twenty);

    // Node thirty = new Node(30);
    // root.children.add(thirty);

    // Node forty = new Node(40);
    // root.children.add(forty);

    // Node fifty = new Node(50);
    // twenty.children.add(fifty);

    // Node sixty = new Node(60);
    // twenty.children.add(sixty);

    // Node seventy = new Node(70);
    // thirty.children.add(seventy);

    // Node eighty = new Node(80);
    // thirty.children.add(eighty);

    // Node ninety = new Node(90);
    // thirty.children.add(ninety);

    // Node hundred = new Node(100);
    // forty.children.add(hundred);

    // Node hundredten = new Node(110);
    // eighty.children.add(hundredten);

    // Node hundredtwenty = new Node(120);
    // eighty.children.add(hundredtwenty);

    // levelOrderWise(root);
    // levelOrder(root);
    int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    Node root = construct(arr);
    display(root);

  }
}
