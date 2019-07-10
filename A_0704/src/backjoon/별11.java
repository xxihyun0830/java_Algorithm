<<<<<<< HEAD
package backjoon;
import java.util.*;
public class º°11 {

	/////////³ª´Â ÀÌÇØ¸¦ ¸ø ÇÏ°Ú´Ù..¤¾ ÇÁ¸°Æ®¶óµµ ÇØ¼­ ºÁ¾ß °Ú´Ù...
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
public class ë³„11 {

	/////////ë‚˜ëŠ” ì´í•´ë¥¼ ëª» í•˜ê² ë‹¤..ã…Ž í”„ë¦°íŠ¸ë¼ë„ í•´ì„œ ë´ì•¼ ê² ë‹¤...
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
