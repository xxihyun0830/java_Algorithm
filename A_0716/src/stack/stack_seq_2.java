package stack;

import java.util.*;

public class stack_seq_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num = 1; 

		int cnt = 0;
		Stack<Integer> stack = new Stack<>();
		int[] arr = new int[N];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			
			if (num <= arr[i]) {
				while (num <= arr[i]) { 
					stack.push(num);
					sb.append("+"+"\n");
					num++;
				}
				
				if (stack.peek() == arr[i]) {
					sb.append("-"+"\n");
					cnt++;
					stack.pop();
				}
			}else if(num > arr[i]) {
				if (stack.peek() == arr[i]) {
					sb.append("-"+"\n");
					cnt++;
					stack.pop();

				}
			}
		}
		
		if(cnt != N) {
			System.out.println("NO");
		}else {
			System.out.println(sb.toString());
		}
		
		sc.close();
		
	}

}
