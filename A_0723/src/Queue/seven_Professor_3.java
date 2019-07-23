package Queue;
import java.util.*;
public class seven_Professor_3 {

	public static Double[] list_insertsort(Double [] list) {
		for(int i = 1;i<list.length;i++) {
			double a = list[i];
			int bIdx = i-1;
			
			while(bIdx >= 0 && a < list[bIdx]) {
				list[bIdx +1] = list[bIdx];
				bIdx --;
			}
			list[bIdx + 1] = a;
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		
		Double [] list = new Double[times];
		
		for(int i = 0; i< list.length;i++) {
			double score = sc.nextDouble();
			list[i] = score;
		}
		list = list_insertsort(list);
		for(int i = 0; i<7;i++) {
			System.out.printf("%.3f%n", list[i]);
		}
		sc.close();

	}

}
