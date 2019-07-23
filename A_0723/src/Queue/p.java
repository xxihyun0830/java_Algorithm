package Queue;
import java.util.*;
import java.util.Scanner;

public class p {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		
		Double [] list = new Double[times];
		
		for(int i = 0; i< list.length;i++) {
			double score = sc.nextDouble();
			list[i] = score;
		}
		
		
		System.out.println(list.toString());
		System.out.println("---------------------------");
		
		for(int i = 0; i<7;i++) {
			System.out.printf("%.3f%", list[i]);
		}
		sc.close();

	}

}
