package backjoon;
import java.util.Scanner;
public class ���ϱ����Ŭ {
	
	public int cycle (int n) {
		
		int a = n/10; //10�� �ڸ� ��
		int b = n%10; //1�� �ڸ� ��
		
		int c = a + b;
		int c_b = c%10;
		
		return c_b + (b*10);
	
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0<N<=99 ������ ���� �Է� :");
		int N = sc.nextInt();
		
		���ϱ����Ŭ a = new ���ϱ����Ŭ();
		
		int new_num = a.cycle(N);
		int count = 1;
		while(new_num != N) {
			count ++;
			new_num = a.cycle(new_num);
		}
		
		System.out.println(count);
		
		sc.close();
		
	}

}
