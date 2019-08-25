package stack;
import java.util.*;
public class parenthesis_string_1_9012 {
	
	//아늬 맞게 나오는데 왜 틀리냐고 그르냐고!!!!
	public static String VPSCheck(String str) {
		LinkedList<String> list = new LinkedList<String>();
		String [] arr = str.split("");
		
		for(int i=0; i<arr.length; i++) {
			String tokens = arr[i];
			if(tokens.equals("(")) { //열린 괄호일 때
				list.push(tokens);
			}else { //닫힌 괄호일 떄
				if(list.size() != 0) {//list에  "("있다면
					list.pollLast(); //
				}else { //list에 아무것도 없다면
					list.push(tokens);
				}
				
			}
		}
		System.out.println("--------------");
		if(list.size() == 0) {
			return "YES";
		}else {
			return "NO";
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList <String> res = new ArrayList<String>();
		
		System.out.print("how many times : ");
		int times = sc.nextInt();
		
		
		while (times != 0) {
			System.out.print("enter str : ");
			String str = sc.next();
			String ans = VPSCheck(str);
			res.add(ans);
			
			times --;
		}
		System.out.println(">>>>>>>>>>>>>>");
		for(int i = 0; i< res.size();i++) {
			System.out.println(res.get(i));
		}
		sc.close();
		
		
	}
}
