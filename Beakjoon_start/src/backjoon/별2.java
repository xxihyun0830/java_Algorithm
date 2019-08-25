package backjoon;
import java.util.Scanner;
public class º°2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<N+1;i++) {
			for(int j=(N-i);j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		sc.close();
		
	}

}
