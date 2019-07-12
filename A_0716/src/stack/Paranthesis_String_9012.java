package stack;
import java.util.*;
public class Paranthesis_String_9012 {
	
	//아늬 맞게 나오는데 왜 틀리냐고 그르냐고!!!!
	public String VPSCheck(String str) {
		ArrayList<String> list = new ArrayList<String>();
		String [] arr = str.split("");
		
		for(int i=0; i<arr.length; i++) {
			String tokens = arr[i];
			if(tokens.contentEquals("(")) {
				list.add(tokens);
			}else {
				if(list.size() != 0) {
					list.remove(list.size()-1);
				}else {
					list.add(tokens);
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
		Paranthesis_String_9012 a = new Paranthesis_String_9012();
		ArrayList <String> res = new ArrayList<String>();
		
		System.out.print("how many times : ");
		int times = sc.nextInt();
		
		
		while (times != 0) {
			System.out.print("enter str : ");
			String str = sc.next();
			String ans = a.VPSCheck(str);
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
