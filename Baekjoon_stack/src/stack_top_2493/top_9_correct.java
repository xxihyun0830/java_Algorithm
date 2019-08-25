package stack_top_2493;
import java.util.*;
import java.io.*;
public class top_9_correct {
	 
	/*
	 * �ԷµǴ� ���� �ᱹ���� ��� stack�� �߰��ȴ�.
	 * ������ ������ �ϳ��� �����鼭 ���� �Էµ� ���� ���Ѵ�.
	 * �̷��� �ϸ� ���� �Էµ� ���� ���ʺ��� �񱳸� �ϰ� �ǹǷ� �ᱹ���� ���ŵǴ� ž�� ��ȣ�� �� �� �ְ� �ȴ�. 
	 * 
	 * -> ����Ʈ�� ���ÿ��� max���� ���� ���� �ƴϴ�! �Է¹��� ���� ��� ��Ƽ� ���ο� ���� �Էµ� ������
	 * �񱳸� �Ͽ� �ᱹ sb�� � ���� �߰����Ǵ����� �˾Ƴ��� �ȴ�. 
	 * ��°��� �������� ���� 2������. vlaueStack�� ����ְų� ���� �Էµ� �� < stack.peek() �� ��.
	 * 
	 * 
	 *
	 *
	 *

*/
	
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		Stack<Integer> indexStack = new Stack<>();
		Stack<Integer> valueStack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st =  new StringTokenizer(bf.readLine());
		
		
		//ù ���� ���ڴ� �׻� valueStack push�ȴ�. ��°��� �׻� 0
		valueStack.push(Integer.parseInt(st.nextToken()));
		indexStack.push(1);
		sb.append("0 ");
		
		System.out.println("indexStack : " + indexStack.toString());
		System.out.println("valueStack : " + valueStack.toString());
		
		//2��° �Է� ���ں���~
		for(int i = 1; i< n;i++) {
			int m = (Integer.parseInt(st.nextToken()));
			System.out.println("_______________________________________");
			System.out.println("curr-m : " + m);
			
			//valueStack�� ���� ���� ��
			while(!valueStack.isEmpty()) { 
				//�Է¹��� ���� ���� ��
				if(m < valueStack.peek()) { 
					sb.append(indexStack.peek()+" "); 
					//���� valueStack�� �ִ� ���� �ε����� ���
					System.out.println("indexStack : " + indexStack.toString());
					System.out.println("valueStack : " + valueStack.toString());
					System.out.println("--------------------------------------");
				    break;
				}
				//�Էµ� ���� Ŭ ���, ������ ���ÿ� �ִ� ���� �ε����� ��� pop
				valueStack.pop();
				indexStack.pop();
				System.out.println("indexStack : " + indexStack.toString());
				System.out.println("valueStack : " + valueStack.toString());
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			}
			
			//������ ������ ū ���� �ԷµǾ, ������ ������ ��� pop�ȴ� 
			// == valueStack�� ���. 
			if(valueStack.isEmpty()) {
				sb.append("0 ");
				
			}
			
			//�Է¹��� ���� push
			valueStack.push(m);
			indexStack.push(i+1);
			System.out.println("indexStack : " + indexStack.toString());
			System.out.println("valueStack : " + valueStack.toString());
			System.out.println("========================================");
		}
		
		System.out.println(sb.toString());
	}
}

//�ᱹ ������ ���ÿ� �ִ� ������ �� ū�� �������� �Ǵ��ϸ� �Ǵ� ��������.
//
