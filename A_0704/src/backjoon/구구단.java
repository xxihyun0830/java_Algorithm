package backjoon;
import java.util.Scanner;
public class ±¸±¸´Ü {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=N; N+1>i; i++) {
			for(int j =1; j<10; j++ ) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		sc.close();
	}
}
