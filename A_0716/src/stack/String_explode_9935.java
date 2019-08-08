package stack;
import java.util.*;
import java.io.*;
public class String_explode_9935 {
	
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine()); //�������� ����
        
       
        String str = stz.nextToken(); //���ڿ�
        String exp = stz.nextToken(); // ���� ���ڿ�
        
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
		 * ������ ����� ���, ���� ���̽��� �ִ�.
		 * 1. ���ڿ��� ���� ���忭�� ���� ���ÿ� �ְ� �ϳ��� pop�ϸ鼭 ���ϴ� ��
		 *    ��, �� ��� ��->�� ������ �񱳵ǹǷ� ����� �� ��ġ�� �ٲ�� �Ѵ�.
		 *    
		 * 2. ������� ���ÿ� �ִ� ���
		 *    ���� ���ڿ��� �������� ���Ѵ�.(1���� ��������) ��½� ����
		 * 
		*/
        
	}

}
