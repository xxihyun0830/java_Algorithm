package stack;
import java.util.*;
import java.io.*;
public class String_explode_9935 {
	
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine()); //띄어쓰기으로 구분
        
       
        String str = stz.nextToken(); //문자열
        String exp = stz.nextToken(); // 폭발 문자열
        
        String[] s1 = str.split("");
        String[] s2 = exp.split("");
        
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        
        for(String e1 : s1) {
        	stack1.push(e1);
        }
        for(String e2:s2) {
        	stack2.push(e2);
        }
        
        ArrayList<String> arr = new ArrayList<>();
        
		/*
		 * 스택을 사용할 경우, 여러 케이스가 있다.
		 * 1. 문자열과 폭발 문장열을 각각 스택에 넣고 하나씩 pop하면서 비교하는 것
		 *    단, 이 경우 뒤->앞 순서로 비교되므로 출력할 때 위치를 바꿔야 한다.
		 *    
		 * 2. 결과값을 스택에 넣는 경우
		 *    폭발 문자열을 기준으로 비교한다.(1번과 마찬가지) 출력시 주의
		 * 
		*/
        
	}

}
