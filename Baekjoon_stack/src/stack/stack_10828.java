package stack;
import java.util.*;
public class stack_10828 {
	public void push(ArrayList <Integer> Stack, int n) {
		Stack.add(n);
	}
	
	public ArrayList <Integer> pop(ArrayList <Integer> Stack) {
		int len = Stack.size();
		if(Stack.size() != 0) {
			System.out.println(Stack.get(len-1));
			Stack.remove(len-1);
			return Stack;
		}else {
			System.out.println(-1);
			return Stack;
		}
	}
	
	public void size(ArrayList <Integer> Stack) {
		System.out.println(Stack.size());
	}
	
	public void empty(ArrayList <Integer> Stack) {
		if(Stack.size() != 0) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}
	
	public void top(ArrayList <Integer> Stack) { //stack의 가장 위에 있는 정수를 보여주기만 함.
		if(Stack.size() != 0) {
			System.out.println(Stack.get(Stack.size()-1));
		}else {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stack_10828 s = new stack_10828();
		ArrayList <Integer> Stack = new ArrayList<Integer>();
		
		System.out.print("반복 횟수 : ");
		int times = sc.nextInt();
		System.out.println("********************");
		while(times != 0) {
			System.out.print("order : ");
			String order = sc.next();
			System.out.println("--------------------");
			
			
			switch(order) {
			case "push":
				int n = sc.nextInt();
				s.push(Stack,n);
				System.out.println(Stack);
				times--;
				continue;
				
			case "pop":
				Stack = s.pop(Stack);
				times--;
				continue;
			case "size":
				s.size(Stack);
				times--;
				continue;
			case "empty":
				s.empty(Stack);
				times--;
				continue;
			case "top":
				s.top(Stack);
				times--;
				continue;
			}
			
		}
		sc.close();
		
		
		

	}

}
