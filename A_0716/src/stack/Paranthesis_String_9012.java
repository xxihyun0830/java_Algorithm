package stack;
import java.util.*;
public class Paranthesis_String_9012 {
	
	public void VPSCheck(String str) {
		ArrayList<String> list = new ArrayList<String>();
		String [] arr = str.split("");
		
		for(int i=0; i<arr.length; i++) {
			String tokens = arr[i];
			if(list.size() == 0) {
				list.add(tokens);
			}else {
				String peak = list.get(list.size()-1);
				if(tokens == "(") {
					list.add(tokens);
				}else {
					list.remove(index)
				}
			}
			
			
		}
		System.out.println("--------------");
		if(list.size() == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paranthesis_String_9012 a = new Paranthesis_String_9012();
		
		System.out.print("how many times : ");
		int times = sc.nextInt();
		
		while (times != 0) {
			System.out.print("enter str : ");
			String str = sc.next();
			a.VPSCheck(str);
			times --;
		}
		sc.close();
		
		
	}
}
