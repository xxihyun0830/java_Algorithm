package backjoon;
import java.util.Scanner;

public class 아스키코드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//1) hashCode를 이용하기
		System.out.println(str.hashCode());
		
		//2) String to Char 이용
		char [] cha_arr = str.toCharArray();
		System.out.println(cha_arr[0] * 1);
		sc.close();
	
	}

}
