package stack_top_2493;

import java.util.*;

class top{
	int index;
	int value;
	
	public top(int index, int value) {
		this.index = index;
		this.value = value;
	}
}

public class top_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<top> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int index = 1;
		
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			
			if(stack.isEmpty()) {
				stack.push(new top(index, m));
				sb.append(0);
				System.out.println("-->"+"0");
				System.out.println("("+stack.peek().index + ", "+ stack.peek().value +")");
				index ++;
			}else { 
				top t = stack.pop();
				if(t.value > m) {
					stack.push(t);
					sb.append(t.index);
					System.out.println("-->"+t.index);
					System.out.println("("+stack.peek().index + ", "+ stack.peek().value +")");
				}else if(t.value < m) {
					//새로운 max의 등장
					stack.push(new top(index, m));
					sb.append(0);
					System.out.println("-->"+"0");
					System.out.println("("+stack.peek().index + ", "+ stack.peek().value +")");
				}
				index ++;
			}
		}
		System.out.println("------------------------");
		
		for(int i = 0; i <n;i++) {
			System.out.print(sb.charAt(i)+" ");
		}
		
		sc.close();
	}
}