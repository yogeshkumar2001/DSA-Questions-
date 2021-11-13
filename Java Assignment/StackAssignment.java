import java.util.*;
import java.lang.*;
import java.io.*;

class StackAssignment
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Stack< Integer> st = new Stack< >();
    System.out.println("###########Stack Operations###############");
    st.push(10); // push 10 in stackFF
    st.push(20); // push 20 in stack
    System.out.println("Stack -> "+ st); // print stack
    System.out.println("Stack -> "+ st + "->" + "peek->"+st.peek()); //print stack with peek value 
    System.out.println("Stack -> "+ st + "->" +"size->"+ st.size()); //print stack with size 
    System.out.println("Is Stack Empty: " + st.empty()); // return true or false 
    st.pop();
    System.out.println("Stack -> "+ st);
    System.out.println("Stack -> "+ st + "->" +"peek->" +st.peek());//print stack with peek value
    st.pop();
    System.out.println("Stack -> "+ st + "->" + " size->" + st.size());//print stack with size F
    System.out.println("Is Stack Empty: " + st.empty()); // return true or false 
    
    // now some opertion for Queue
    System.out.println("$$$$$$$$$$Queue Operations$$$$$$$$$$");
    Queue< Integer> q = new ArrayDeque<>();
    q.add(10);// add the element in queue
    q.add(20); // add the element in queue 
    System.out.println("Queue ->"+q); // print Queue
    System.out.println("Queue ->"+q + "->" + "peek"+q.peek() ); //print queue with peek value
    q.remove(); // remove the element
    System.out.println("Queue ->"+q + "->" +  " size ->" + q.size()); //print queue with peek value
  }
}