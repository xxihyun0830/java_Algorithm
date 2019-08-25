package backjoon;
import java.util.Scanner;
import java.util.ArrayList;


//������� �и��� �´µ� �� ����� Ʋ�ȴٰ� �ϴ� �ɱ�...����,,,
public class ������Ѱ���{
	
	//����� �Ѵ� �л����� ���� �������ִ� �޼ҵ� 
	public double res (ArrayList<Integer> sc_arr) { //parameter�� �ϳ��� ���̽��� ������ ��.
		                                            // 5���� ���̽� �߿��� 5���� ������ �ִ� ���̽���� ���� �ȴ�.
		double over_avr_ratio ;
		int len = sc_arr.size();
		int sum = 0;
		
		// ��� ���ϱ�
		for(int i=0; i<len;i++) {
			int a = sc_arr.get(i);
			sum = sum + a;
		}
		int avr = sum/len;
		
		//����� �ʰ��ϴ� ����� ���� ���ϱ�
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
		������Ѱ��� a = new ������Ѱ���();
        
		int tc = sc.nextInt();
		
		for(int i=0; i<tc;i++) {
			int stu = sc.nextInt();
            
			while (stu != 0) {
				int score = sc.nextInt(); 
				sc_arr.add(score);
				stu --;
			}

			double r_res =a.res(sc_arr); //���� ���ϰ� res_arr��  add
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
