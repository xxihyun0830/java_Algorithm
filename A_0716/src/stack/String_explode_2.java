package stack;
import java.util.*;
public class String_explode_2 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String str = sc.nextLine();
		String exp = sc.nextLine();
		
		String[] a1 = new String[1000000];
		String[] a2 = new String[36];
		
		//받은 문자열을 잘라서 배열에 넣고 또다시 리스트로 저장
		a1 = str.split("");
		a2 = exp.split("");
		
		ArrayList<String> s1 = new ArrayList<>();
		ArrayList<String> s2 = new ArrayList<>();
		
		for(String e1 : a1) {
			s1.add(e1);
		}
		System.out.println(s1.toString());
		System.out.println("----------------------------");
		for(String e2 : a2) {
			s2.add(e2);
		}
		System.out.println(s2.toString());
		System.out.println("---------------------------------");
		
		//-------------------------------------
		
		
		//폭발열 문자를 기준으로 한다. 
		// C4일 경우, C와 일치하는 문자열을 찾아내고 삭제한다. 
		// 문자열 전체 탐색을 완료했다면 그 다음 폭발열 문자인 4에 대해서 동일하게 수행
		/*for(int i = 0; i< s2.size(); i++) {
			String c2 = s2.get(i); 
			for(int j = 0; j<s1.size();j++) {
				String c1 = s1.get(j);
				if(c2.equals(c1)) {
					s1.removeAll(s2);
				}
				
			}
		}
		*/
		
		s1.removeAll(s2);
		
		if(s1.isEmpty()) {
			System.out.println("FRULA");
		}
		else {
			for(String e: s1) {
				System.out.print(e);
			}
		}
		
		sc.close();
		
	}

}
