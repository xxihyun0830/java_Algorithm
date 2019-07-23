package Queue;
import java.util.*;
public class seven_Professor_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Double> list = new LinkedList<Double>();
		
		int times = sc.nextInt();
		/*
		 * if(times < 8) { System.out.println("입력하는 점수는 8개 이상이어야 합니다. "); times =
		 * sc.nextInt(); }
		 */
		while(times != 0) {
			double score = sc.nextDouble();
			list.add(score);
			times --;
		}
		Collections.sort(list);
			
		for(int i= 0; i<7;i++) {
			System.out.printf("%.3f%n",list.get(i));
		}
		sc.close();
	}

}
