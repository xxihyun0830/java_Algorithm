<<<<<<< HEAD
package backjoon;
import java.util.*;
public class 별11 {

	/////////나는 이해를 못 하겠다..ㅎ 프린트라도 해서 봐야 겠다...
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

=======
    
package backjoon;
import java.util.*;
public class 蹂�11 {

	/////////�굹�뒗 �씠�빐瑜� 紐� �븯寃좊떎..�뀕 �봽由고듃�씪�룄 �빐�꽌 遊먯빞 寃좊떎...
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

>>>>>>> 819c0fca39970c3edba05b4446e66ab2f7b85252
