package stack;
import java.util.*;

public class String_explode_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String exp = sc.nextLine();
		
		Stack<String[]> stack1 = new Stack<>();
		Stack<String[]> stack2 = new Stack<>();
		
		stack1.push(str.split(""));
		stack2.push(exp.split(""));
		
		stack1.pop();
		stack1.pop();
		stack1.pop();
		
		
		sc.close();
	}
}
