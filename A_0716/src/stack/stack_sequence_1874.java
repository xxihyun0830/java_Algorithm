package stack;

import java.io.*;
import java.util.*;

public class stack_sequence_1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num = 1; 
		//�̷��� ���� ���� ���ο� ����Ʈ�� ���� �ϳ��� �������鼭 �� �ʿ䰡 ����

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
					num++;
					
				}
				if (stack.peek() == arr[i]) {
					System.out.println("-----pop-stack : "+stack.peek());
					System.out.println(stack.peek() + "-");
					stack.pop();

				}

			}
			
			if(num > arr[i]) {
				
			}

		}

	}

}
