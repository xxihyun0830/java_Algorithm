package backjoon;
import java.util.*;
public class OX퀴즈 {
	
	//입력된 것 중에서 O만 추려내기->O갯수담은 리스트 출력
	public ArrayList<Integer> remain_O(String str) {
		String [] tokens = str.split("X");
		int len = tokens.length;
		ArrayList <Integer> t_arr = new ArrayList<Integer>();
		
		for(int i=0; i<len; i++) {
			int t_len = tokens[i].length();
			if (t_len != 0 ) {
				t_arr.add(t_len);
			}
		}
		return t_arr;
	}
	
	//O점수 계산하기
	public int score_O(ArrayList <Integer> remain_O_arr) {
		int len = remain_O_arr.size();
		int sum = 0;
		
		for(int i=0; i<len;i++ ) {
			int n = remain_O_arr.get(i);
			int ans = (n*(n+1))/2;
			sum = ans + sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList <Integer> remain_O_arr = new ArrayList <Integer>();
		ArrayList <String > tc_arr = new ArrayList <String>();
		ArrayList <Integer> res = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		OX퀴즈 a = new OX퀴즈();
		
		System.out.print("test-case : ");
		int test_case = sc.nextInt();
		
		
		for(int i=0; i< test_case; i++) {
			System.out.println("input result :  ");
			String str = sc.next();
			tc_arr.add(str); //각 case마다 OX나열식 받기 
			
		}
		System.out.println("입력받은 값 : "+tc_arr);
		
		for(int i=0; i< tc_arr.size(); i++) {
			String str = tc_arr.get(i);
			remain_O_arr = a.remain_O(str);
			int res_sum = a.score_O(remain_O_arr);
			res.add(res_sum);
		}
		
		for(int j=0; j< res.size() ; j++) {
			System.out.println(res.get(j));
		}
		sc.close();
	}

}
