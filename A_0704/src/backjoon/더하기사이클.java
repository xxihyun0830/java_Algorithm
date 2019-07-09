package backjoon;
import java.util.Scanner;
public class 더하기사이클 {
	
	public int cycle (int n) {
		
		int a = n/10; //10의 자리 수
		int b = n%10; //1의 자리 수
		
		int c = a + b;
		int c_b = c%10;
		
		return c_b + (b*10);
	
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0<N<=99 사이의 정수 입력 :");
		int N = sc.nextInt();
		
		더하기사이클 a = new 더하기사이클();
		
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
