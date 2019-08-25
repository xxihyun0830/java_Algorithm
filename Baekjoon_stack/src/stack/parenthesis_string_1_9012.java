package stack;
import java.util.*;
public class parenthesis_string_1_9012 {
	
	//�ƴ� �°� �����µ� �� Ʋ���İ� �׸��İ�!!!!
	public static String VPSCheck(String str) {
		LinkedList<String> list = new LinkedList<String>();
		String [] arr = str.split("");
		
		for(int i=0; i<arr.length; i++) {
			String tokens = arr[i];
			if(tokens.equals("(")) { //���� ��ȣ�� ��
				list.push(tokens);
			}else { //���� ��ȣ�� ��
				if(list.size() != 0) {//list��  "("�ִٸ�
					list.pollLast(); //
				}else { //list�� �ƹ��͵� ���ٸ�
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
