package correct;
import java.util.*;
import java.io.*;

public class stick_laser_10799 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		
		int ans = 0;
		int stick = 0;
		
		for(int i = 0; i < str.length();i++) {
			System.out.println("i :" + i);
			if(str.charAt(i)=='(') {
				if(str.charAt(i+1) == ')') {
					System.out.println("--------------------laser!!!");
				}else {
					stick += 1;
					ans += 1;
					System.out.println(">>>>>>>stick : " + stick);
					System.out.println("## ans :" + ans );
				}
			}else {
				if(str.charAt(i-1) == '(') {
					System.out.println("____________________laser!!!");
					ans = ans + stick;
					System.out.println("## ans :" + ans );
				}else {
					stick -= 1;
					System.out.println(">>>>>>>>stick : " + stick);
					System.out.println("## ans :" + ans );
				}
				
			}
		}
		
		System.out.println("total : "+ans);
	}
}
