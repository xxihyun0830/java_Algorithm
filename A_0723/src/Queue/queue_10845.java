package Queue;

import java.util.*;

public class queue_10845 {
	
	public static void main(String[] args) {
		
		Queue <Integer> q = new LinkedList<Integer>(); 
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int times = sc.nextInt();
		
		while(times != 0) {
			times --;
			
			String order = sc.next();
			
			if(order.equals("push")) {
				a = sc.nextInt();
				q.add(a);
			}else if(order.equals("front")) {
				System.out.println(q.isEmpty()? -1:q.peek());
			}else if(order.equals("back")) {
				System.out.println(q.isEmpty()? -1:a);
			}else if(order.equals("pop")) {
				System.out.println(q.isEmpty()? -1:q.poll());
			}else if(order.equals("size")) {
				System.out.println(q.size());
			}else if(order.equals("empty")) {
				System.out.println(q.isEmpty()? 1:0);
			}
		}
		
		sc.close();
		
	}
	

}
