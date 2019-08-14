package stack;
import java.io.*;
import java.util.*;
public class top_2493 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> st = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i <n;i++) {
			int m = sc.nextInt();
			stack.push(m);
			
		}
		
		while(stack.size() != 0) {
			if(stack.size() == 1) {
				st.push(0);
				break;
			}else {
				int top = stack.pop();
			    int next = stack.peek();
			    System.out.println("top :" + top);
			    System.out.println("next :" + next);
			
			    if(top < next) {
			    	int a = stack.indexOf(next);
				    System.out.println("-------------a :" + (a+1));
				    st.push(a+1);
			    }else if(top > next) {
			    	
				    int a = stack.pop();
				    next = stack.peek();
				    stack.push(a);
				    if(top < next) {
				    	int b = stack.indexOf(next);
					    System.out.println("-------------b :" + (b+1));
					    st.push(b+1);
				    	
				    }else {
				    	continue;
				    }
			    	
			    }
			}
		}
		
		System.out.println(">>");
		while(st.size() !=0) {
			System.out.print(st.pop() + " ");
		}
	}

	
}
