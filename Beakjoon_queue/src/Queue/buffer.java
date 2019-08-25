package Queue;
import java.util.*;
import java.io.*;
public class buffer{

	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("문자 입력");
			String s = bf.readLine();
			System.out.println("숫자 입력");
			int i = Integer.parseInt(bf.readLine());
			
			System.out.println("칠무해 " + s + "///"+ i);
			
			bf.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		

	}

}
