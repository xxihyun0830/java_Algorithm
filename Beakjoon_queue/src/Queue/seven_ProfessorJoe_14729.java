package Queue;
import java.util.*;
import java.io.*;

//�޸� �ʰ��� �ߴµ� ������ �𸣰ڴ�...
public class seven_ProfessorJoe_14729 {

	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<Double>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try{
			int times = Integer.parseInt(bf.readLine());
			if(times < 8) {
				System.out.println("�Է��ϴ� ������ 8�� �̻��̾�� �մϴ�. ");
				times = Integer.parseInt(bf.readLine());
			}
			
			while(times != 0) {
				double score = Double.parseDouble(bf.readLine());
				list.add(score);
				times --;
			}
			
			Collections.sort(list);
			
			for(int i= 0; i<7;i++) {
				System.out.printf("%.3f%n",list.get(i));
			}
						
			bf.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		

	}

}
