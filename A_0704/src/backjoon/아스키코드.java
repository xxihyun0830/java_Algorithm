package backjoon;
import java.util.Scanner;

public class �ƽ�Ű�ڵ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//1) hashCode�� �̿��ϱ�
		System.out.println(str.hashCode());
		
		//2) String to Char �̿�
		char [] cha_arr = str.toCharArray();
		System.out.println(cha_arr[0] * 1);
		sc.close();
	
	}

}
