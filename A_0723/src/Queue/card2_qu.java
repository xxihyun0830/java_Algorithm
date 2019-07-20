package Queue;
import java.util.*;
public class card2_qu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<n+1;i++) {
			q.add(i);
		}
		
		while(q.size() != 1) {
			q.poll();
			int a = q.peek();
			q.poll();
			q.add(a);
		}
		System.out.println(q.peek());
	}

}
