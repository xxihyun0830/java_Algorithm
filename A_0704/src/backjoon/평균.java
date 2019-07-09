package backjoon;
import java.util.Scanner;
import java.util.ArrayList;
public class 평균 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> arr = new ArrayList<Double>();
		ArrayList<Double> new_arr = new ArrayList<Double>();
		
		int N = sc.nextInt();
		
		//과목 갯수만큼 점수 리스트 생성 
		while (N != 0) {
			double score = sc.nextInt();
			arr.add(score);
			N -= 1;
		}
		System.out.println("기존 점수 : "+arr);
		
		
		int len = arr.size();
		double max = 0;
		
		//최대 점수 찾기
		for(int i=0; i< len;i++) {
			if (arr.get(i) >= max) {
				max = arr.get(i);
			}
		}
		System.out.println("최대 점수 :" + max);
		
		// 점수 바꾸기
		double num = 0;
		for(int j = 0; j< len; j++) {
			num = arr.get(j);
			double new_score = (num/max) * 100;
			new_arr.add(new_score );
		}
		System.out.println("새로운 점수 : " + new_arr);
		
		//새로운 평균 구하기
		double sum = 0;
		for(int k=0; k<len; k++) {
			sum = sum + new_arr.get(k);
		}
		double new_avr = sum/len;
		
		System.out.print("새로운 평균 : ");
		System.out.println(new_avr);
		
		sc.close();

	}

}
