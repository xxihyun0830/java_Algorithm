package stack;

import java.util.*;
public class top_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			list.add(m); //indexOf�� ����ϱ� ���ؼ� �ʿ��� 
			System.out.println("_______________________________________");
			System.out.println("curr-m :" + m);
			
					
			if(stack.isEmpty()) {
				stack.push(m);
				System.out.println("-----0" + " first ");//
				
			}
		}
	}
}