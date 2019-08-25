package stack_2;

import java.util.*;
public class top_4 {
	public static void main(String[] args) throws Exception{
		//결과값은 맞게 뜨는 데, 시간초과 걸림
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			list.add(m);
			System.out.println("_______________________________________");
			System.out.println("curr-m :" + m);
			
					
			if(stack.isEmpty()) {
				stack.push(m);
				System.out.println("-----0" + " first ");//
				
			}else {
				int top = stack.peek();
				if(top < m) {
					System.out.println("curr-top : " + top);
					if(list.indexOf(m)== 1) {
						System.out.println("----0 ");
						top = m;
						stack.push(top);
						
					}
					
					if((list.indexOf(top)-list.indexOf(m)) == 1 || list.indexOf(top)-list.indexOf(m)== -1){
						System.out.println("curr-top : " + top);
						System.out.println( "-----"+(list.indexOf(top)+1) );
						
					}else {
						if(stack.size() != 0) {
							if(top < m) {
								System.out.println("curr-top : " + top);
								System.out.println("-----"+"0");
							}
							
						}
						stack.push(m);
						top = m;
					}
				}else if(top > m) {
					if((list.indexOf(top)-list.indexOf(m)) == 1 || list.indexOf(top)-list.indexOf(m)== -1){
						System.out.println("curr-top : " + top);
						System.out.println( "-----"+(list.indexOf(top)+1) );
						
					}else {
						
						System.out.println("curr-top : " + top);
						System.out.println( "-----"+(list.indexOf(top)+1) );
						stack.push(m);
						top = m;
					}
				}
			}
			
		}
		sc.close();
		
		
	}
}
