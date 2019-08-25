package backjoon;
import java.util.Scanner;
public class ���ϸ��߱� {
	
	public int preMonth_lastDay_R(int Month) {
		int lastDay_R = 1000;
		int preMonth = ( Month -1) ;
		switch(preMonth) {
		case 1: lastDay_R = 3; break; // 1���� ������ ���� ����
		case 2: lastDay_R = 3; break;
		case 3: lastDay_R = 6; break;
		case 4: lastDay_R = 1; break;
		case 5: lastDay_R = 4; break;
		case 6: lastDay_R = 6; break;
		case 7: lastDay_R = 2; break;
		case 8: lastDay_R = 5; break;
		case 9: lastDay_R = 0; break;
		case 10: lastDay_R = 3; break;
		case 11: lastDay_R= 5; break;
		}
		
		return lastDay_R;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Month = sc.nextInt();
		int date = sc.nextInt();
		System.out.println(Month+"�� " + date + "��");
		���ϸ��߱� a = new ���ϸ��߱�();
		int day_R ;
		
		if(Month ==1) {
			day_R = (date) % 7;
			
		}else {
		    int preMonth_lastDay_R = a.preMonth_lastDay_R(Month);
		    System.out.println("���� ���� ������ ���� : "+preMonth_lastDay_R);
		    day_R = (preMonth_lastDay_R + date) % 7;
		}
		
		switch(day_R) {
		case 0: System.out.println("SUN"); break;
		case 1: System.out.println("MON"); break;
		case 2: System.out.println("TUE"); break;
		case 3: System.out.println("WED"); break;
		case 4: System.out.println("THU"); break;
		case 5: System.out.println("FRI"); break;
		case 6: System.out.println("SAT"); break;
	    }
		
		sc.close();
		
	}
}
