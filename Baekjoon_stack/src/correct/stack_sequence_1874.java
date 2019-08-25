package correct;

import java.util.*;

public class stack_sequence_1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num = 1; 
		//이렇게 쓰면 굳이 새로운 리스트를 만들어서 하나씩 가져오면서 쓸 필요가 없음

		int cnt = 0;
		Stack<Integer> stack = new Stack<>();
		int[] arr = new int[N];
		StringBuilder sb = new StringBuilder();

		// 인덱스의 증가없이 계속 유지를 한 상태르 가지고 할 때 어떻게 해야 할까,,,ㅠㅠ
		// -> if 조건문으로 걸고 그 상태에서 while문을 사용하면 된다!
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			System.out.println("__" + arr[i]);

			if (num <= arr[i]) {
				while (num <= arr[i]) { // num까지의 숫자를 stack에 담는 방법!!
					System.out.println("-------------push-curr-num :" + num);
					stack.push(num);
					System.out.println(num + "+");
					sb.append("+"+"\n");
					num++;
					
				}
				
				if (stack.peek() == arr[i]) {
					System.out.println("--------pop-stack : "+stack.peek());
					System.out.println(stack.peek() + "-");
					sb.append("-"+"\n");
					cnt++;
					stack.pop();

				}
				

			}else if(num > arr[i]) {
				if (stack.peek() == arr[i]) {
					System.out.println("--------pop-stack : "+stack.peek());
					System.out.println(stack.peek() + "-");
					sb.append("-"+"\n");
					cnt++;
					stack.pop();

				}
			}
			System.out.println("*****************************************");
			
		}
		
		if(cnt != N) {
			System.out.println("NO");
		}else {
			System.out.println(sb.toString());
		}
		
		sc.close();
		
		
		

	}

}
