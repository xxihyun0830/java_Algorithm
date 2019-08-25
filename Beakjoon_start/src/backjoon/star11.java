
package backjoon;
import java.util.*;
public class star11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String[] result = new String[n];
		result[0] = "  *  ";
		result[1] = " * * ";
		result[2] = "*****";


		String space = "   ";
		if (n!=3) {
			for (int i=3; i<n; i*=2) {
				for (int j=i; j<i*2; j++) {
					result[j] = result[j-i] + " " + result[j-i];
				}
				for (int k=0; k<i; k++) {
					result[k] = space + result[k] + space;
				}
				space += space;
			}

		} 
		for (int i=0; i<n; i++) {
			System.out.println(result[i]);
		}	
	}
}

