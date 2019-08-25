package stack_2;
import java.util.*;

/*class top {
	int index;
	int value;
	
	public top(int index, int value) {
		this.index = index;
		this.value = value;
	}
}*/

public class top_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList<>();
		Stack<top> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n;i++) {
			int m = sc.nextInt();
			list.add(m);
		}
		
		for(int i = 0; i<n;i++) {
			if(i == 0) {
				stack.push(new top(i+1, list.get(i)));
				System.out.println("curr-value :" + list.get(i)+" ->"+"0");
				sb.append("0");
			}else {
				if(list.get(i-1) < list.get(i)) {
					top t = stack.pop();
					if(t.value > list.get(i)) {
						stack.push(t);
						System.out.println("curr-value :" + list.get(i)+"->"+t.index);
					    sb.append(t.index);
					    
					}else if(t.value < list.get(i)) {//새로운 max의 등장
						stack.push(new top(i+1, list.get(i)));
						System.out.println("curr-value :" + list.get(i)+" ->"+"0");
						sb.append("0");
					}else if(t.value == list.get(i)) {
						stack.push(t);
						System.out.println("curr-value :" + list.get(i)+"->"+t.index);
					    sb.append(t.index);
					}
					
				}else if(list.get(i-1) > list.get(i)) {
					top t = stack.pop();
					if(t.value > list.get(i-1)) {
						stack.push(t);
						System.out.println("curr-value :" + list.get(i)+"->"+ (i));
						sb.append(i);
						
					}else if(t.value < list.get(i-1)) { //새로운 max의 등장
						stack.push(new top(i, list.get(i-1)));
						System.out.println("curr-value :" + list.get(i)+" ->"+"0");
						sb.append("0");
						
					}else if(t.value == list.get(i-1)) {
						stack.push(t);
						System.out.println("curr-value :" + list.get(i)+"->"+t.index);
					    sb.append(t.index);
					}
				}
			}
		}
		
		System.out.println("---------------------------------");
		for(int i=0; i<n;i++) {
			System.out.print(sb.charAt(i) + " ");
		}
		
		sc.close();
		

	}

}
