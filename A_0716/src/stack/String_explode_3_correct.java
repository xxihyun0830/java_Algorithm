package stack;
import java.util.*;
import java.io.*;
public class String_explode_3_correct {
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String exp = bf.readLine();
		
		Stack<Character> stack = new Stack<>();
		int len = stack.size();
		boolean isBomb = false;
		
		for(int i = str.length()-1;i >-1;i-- ) {
			stack.push(str.charAt(i));
			if(str.charAt(i) == exp.charAt(0) && stack.size() >= exp.length()) {
				isBomb = true;
				for(int j = 0; j <exp.length();j++) {
					if(stack.get(stack.size()-1-j) != exp.charAt(j)) {
						isBomb = false;
						break;
					}
				}
				
				if(isBomb == true) {
					for(int k=0; k <exp.length();k++) {
						stack.pop();
					}
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		
		System.out.println(stack.size());
		
		if(stack.size() == 0) {
			System.out.println("FRULA");
		}else {
			for(int i = stack.size()-1;i>-1;i--) {
				sb.append(stack.get(i));
				
			}
			System.out.println(sb.toString());
			
		}
		
		
		
		
	}
}
