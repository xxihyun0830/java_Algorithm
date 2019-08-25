package stack;
import java.util.*;
import java.io.*;

public class parenthesis_string_3_correct {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(bf.readLine());


		for(int i = 0; i< n;i++) {
			String str = bf.readLine();
			Stack<String> stack = new Stack<>();

			if(str.length() >=2 && str.length() <=50) {
				String[] arr = new String[str.length()];
				arr = str.split("");

				//앞에서부터 하나씩 가져옴
				for(int j=0; j< str.length();j++) {
					//System.out.println("curr-arr : "+arr[j]);

					if(arr[j].equals("(")) {
						stack.push(arr[j]);
						//System.out.println(stack.toString());

					}else if(arr[j].equals(")")) {
						if(!stack.isEmpty()) {
							if(stack.peek().equals("(")) {
								stack.pop();
								//System.out.println(stack.toString());
							}else {
								stack.push(arr[j]);
								//System.out.println(stack.toString());
							}
						}else {
							stack.push(arr[j]);
							//System.out.println(stack.toString());
						}
					}

				}

				if(stack.size() == 0) {
					sb.append("YES"+"\n");
				}else {
					sb.append("NO"+"\n");
				}
			}

		}

		System.out.println(sb.toString());
	}
}
