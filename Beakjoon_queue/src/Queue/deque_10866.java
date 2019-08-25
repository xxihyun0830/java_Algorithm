package Queue;
import java.util.*;
public class deque_10866 {

   public static void push_front(LinkedList <Integer> deq, int n) {
      deq.addFirst(n);
   }
   
   public static void push_back(LinkedList <Integer> deq, int n) {
      deq.addLast(n);
   }
   public static void pop_front(LinkedList <Integer> deq) {
      if(deq.size() == 0) {
         System.out.println(-1);
      }else {
         System.out.println(deq.pollFirst());   
      }
   }
   public static void pop_back(LinkedList <Integer> deq) {
      if(deq.size() == 0) {
         System.out.println(-1);
      }else {
         System.out.println(deq.pollLast());
      }
      
   }
   public static void size(LinkedList <Integer> deq) {
      System.out.println(deq.size());
   }
   
   public static void empty(LinkedList <Integer> deq) {
      if(deq.isEmpty()) {
         System.out.println(1);
      }else {
         System.out.println(0);
      }
   }
   public static void front(LinkedList <Integer> deq) {
	   if(deq.isEmpty()) {
	         System.out.println(-1);
	      }else {
	    	  System.out.println(deq.peekFirst());
	      }
      
   }
   public static void back(LinkedList <Integer> deq) {
	   if(deq.isEmpty()) {
	         System.out.println(-1);
	      }else {
	    	  System.out.println(deq.peekLast());
	      }
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      LinkedList<Integer> deq = new LinkedList<Integer>();
      int times = sc.nextInt();
      while(times != 0) {
         
         String order = sc.next();
         
         if(order.equals("push_front")) {
            int n = sc.nextInt();
            push_front(deq, n);
         }else if(order.equals("push_back")) {
            int n = sc.nextInt();
            push_back(deq,n);
         }else if(order.equals("pop_front")) {
            pop_front(deq);
         }else if(order.equals("pop_back")) {
            pop_back(deq);
         }else if(order.equals("size")) {
            size(deq);
         }else if(order.equals("empty")) {
            empty(deq);
         }else if(order.equals("front")) {
            front(deq);
         }else if(order.equals("back")) {
            back(deq);
         }
         
         times --;
         
      }
      sc.close();

   }

}