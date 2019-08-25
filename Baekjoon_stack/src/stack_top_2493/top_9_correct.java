package stack_top_2493;
import java.util.*;
import java.io.*;
public class top_9_correct {
	 
	/*
	 * 입력되는 값은 결국에는 모두 stack에 추가된다.
	 * 스택의 값들을 하나씩 꺼내면서 새로 입력된 값과 비교한다.
	 * 이렇게 하면 새로 입력된 값의 왼쪽부터 비교를 하게 되므로 결국에는 수신되는 탑의 번호를 알 수 있게 된다. 
	 * 
	 * -> 포인트는 스택에는 max값이 들어가는 것이 아니다! 입력받은 수를 모두 담아서 새로운 수가 입력될 때마다
	 * 비교를 하여 결국 sb에 어떤 값이 추가가되는지를 알아내면 된다. 
	 * 출력값이 정해지는 경우는 2가지다. vlaueStack이 비어있거나 새로 입력된 값 < stack.peek() 일 때.
	 * 
	 * 
	 *
	 *
	 *

*/
	
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		Stack<Integer> indexStack = new Stack<>();
		Stack<Integer> valueStack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st =  new StringTokenizer(bf.readLine());
		
		
		//첫 번쨰 숫자는 항상 valueStack push된다. 출력값은 항상 0
		valueStack.push(Integer.parseInt(st.nextToken()));
		indexStack.push(1);
		sb.append("0 ");
		
		System.out.println("indexStack : " + indexStack.toString());
		System.out.println("valueStack : " + valueStack.toString());
		
		//2번째 입력 숫자부터~
		for(int i = 1; i< n;i++) {
			int m = (Integer.parseInt(st.nextToken()));
			System.out.println("_______________________________________");
			System.out.println("curr-m : " + m);
			
			//valueStack에 뭐라도 있을 때
			while(!valueStack.isEmpty()) { 
				//입력받은 수가 작을 때
				if(m < valueStack.peek()) { 
					sb.append(indexStack.peek()+" "); 
					//현재 valueStack에 있는 값의 인덱스를 출력
					System.out.println("indexStack : " + indexStack.toString());
					System.out.println("valueStack : " + valueStack.toString());
					System.out.println("--------------------------------------");
				    break;
				}
				//입력된 수가 클 경우, 기존의 스택에 있던 값과 인덱스를 모두 pop
				valueStack.pop();
				indexStack.pop();
				System.out.println("indexStack : " + indexStack.toString());
				System.out.println("valueStack : " + valueStack.toString());
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			}
			
			//기존의 값보다 큰 값이 입력되어서, 기존의 스택이 모두 pop된다 
			// == valueStack이 빈다. 
			if(valueStack.isEmpty()) {
				sb.append("0 ");
				
			}
			
			//입력받은 값을 push
			valueStack.push(m);
			indexStack.push(i+1);
			System.out.println("indexStack : " + indexStack.toString());
			System.out.println("valueStack : " + valueStack.toString());
			System.out.println("========================================");
		}
		
		System.out.println(sb.toString());
	}
}

//결국 기존의 스택에 있는 값보다 더 큰지 작은지를 판단하면 되는 문제였다.
//
