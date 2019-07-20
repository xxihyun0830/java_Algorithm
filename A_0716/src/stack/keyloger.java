package stack;
import java.util.*;
public class keyloger {
	
	public void logger(String str) {
		String [] tokens = str.split("");
		ArrayList <String> list = new ArrayList<String>();
		for(int i=0; i<tokens.length;i++) {
			
			if(tokens[i].equals("<")) {
				if(list.size() != 0) {
					list.add(i-1, " ");
				}
			}else if (tokens[i].equals(">")) {
				if(list.size()!=0) {
					list.add(i+1, " ");
				}
			}else if (tokens[i].equals("-")) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		while(times != 0) {
			String str = sc.nextLine();
			times --;
			
			
		}
		
	}
	
}
