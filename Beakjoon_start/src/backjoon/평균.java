package backjoon;
import java.util.Scanner;
import java.util.ArrayList;
public class ��� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> arr = new ArrayList<Double>();
		ArrayList<Double> new_arr = new ArrayList<Double>();
		
		int N = sc.nextInt();
		
		//���� ������ŭ ���� ����Ʈ ���� 
		while (N != 0) {
			double score = sc.nextInt();
			arr.add(score);
			N -= 1;
		}
		System.out.println("���� ���� : "+arr);
		
		
		int len = arr.size();
		double max = 0;
		
		//�ִ� ���� ã��
		for(int i=0; i< len;i++) {
			if (arr.get(i) >= max) {
				max = arr.get(i);
			}
		}
		System.out.println("�ִ� ���� :" + max);
		
		// ���� �ٲٱ�
		double num = 0;
		for(int j = 0; j< len; j++) {
			num = arr.get(j);
			double new_score = (num/max) * 100;
			new_arr.add(new_score );
		}
		System.out.println("���ο� ���� : " + new_arr);
		
		//���ο� ��� ���ϱ�
		double sum = 0;
		for(int k=0; k<len; k++) {
			sum = sum + new_arr.get(k);
		}
		double new_avr = sum/len;
		
		System.out.print("���ο� ��� : ");
		System.out.println(new_avr);
		
		sc.close();

	}

}
