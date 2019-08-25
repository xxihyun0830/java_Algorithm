package correct;

import java.util.*;

public class stack_sequence_1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num = 1; 
		//�̷��� ���� ���� ���ο� ����Ʈ�� ���� �ϳ��� �������鼭 �� �ʿ䰡 ����

		int cnt = 0;
		Stack<Integer> stack = new Stack<>();
		int[] arr = new int[N];
		StringBuilder sb = new StringBuilder();

		// �ε����� �������� ��� ������ �� ���¸� ������ �� �� ��� �ؾ� �ұ�,,,�Ф�
		// -> if ���ǹ����� �ɰ� �� ���¿��� while���� ����ϸ� �ȴ�!
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			System.out.println("__" + arr[i]);

			if (num <= arr[i]) {
				while (num <= arr[i]) { // num������ ���ڸ� stack�� ��� ���!!
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
