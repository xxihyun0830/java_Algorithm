package backjoon;
import java.util.Scanner;
import java.util.ArrayList;


//결과값은 분명히 맞는데 왜 결과는 틀렸다고 하는 걸까...딥빡,,,
public class 평균은넘겠지{
	
	//평균을 넘는 학생들의 비율 츌력해주는 메소드 
	public double res (ArrayList<Integer> sc_arr) { //parameter는 하나의 케이스만 가져온 것.
		                                            // 5개의 케이스 중에서 5명의 점수가 있는 케이스라고 보면 된다.
		double over_avr_ratio ;
		int len = sc_arr.size();
		int sum = 0;
		
		// 평균 구하기
		for(int i=0; i<len;i++) {
			int a = sc_arr.get(i);
			sum = sum + a;
		}
		int avr = sum/len;
		
		//평균을 초과하는 사람의 비율 구하기
		double count =0.0;
		for(int j = 0; j<len;j++) {
			if (sc_arr.get(j) > avr) {
				count += 1.0;
			}
		}
		over_avr_ratio = (count/len)*100;
		double r_ratio = Math.round(over_avr_ratio*1000)/1000.0;
		
		return r_ratio;
		
	}
	
	public static void main(String[] args) {
		ArrayList <Integer> sc_arr = new ArrayList <Integer>();
		ArrayList <Double> res_arr = new ArrayList <Double>();
		Scanner sc = new Scanner(System.in);
		평균은넘겠지 a = new 평균은넘겠지();
        
		int tc = sc.nextInt();
		
		for(int i=0; i<tc;i++) {
			int stu = sc.nextInt();
            
			while (stu != 0) {
				int score = sc.nextInt(); 
				sc_arr.add(score);
				stu --;
			}

			double r_res =a.res(sc_arr); //비율 구하고 res_arr에  add
			res_arr.add(r_res);
			sc_arr.clear();
		}
		int len = res_arr.size();
		for(int k = 0; k<len;k++) {
			double d = res_arr.get(k);
			float f = (float)d;
			System.out.printf( "%.3f",f);
			System.out.print("%" + "\n");
		}
		sc.close();
		
	}

}
