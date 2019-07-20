package Queue;
import java.util.*;
public class card2_2164 {
	
	public static ArrayList<Integer> resort(ArrayList<Integer> list){
		list.remove(0);
		int b = list.get(0);
		list.remove(0);
		list.add(b);
		System.out.println(list.toString());
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		int a = 1;
		sc.close();
		
		System.out.println("1 ~ n 까지 숫자 넣기 ");
		for(int i = 0; i<n;i++) {
			list.add(a);
			a++;
		}
		
		System.out.println(list.toString());
		System.out.println("----------------");
		
		while (list.size() != 1) {
			list = resort(list);
		}
		System.out.println(list.get(0));
		
		System.out.println(list.toString());
		System.out.println("----------------");
		

	}

}
