package Queue;
import java.util.*;
import java.io.*;
public class buffer{

	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("���� �Է�");
			String s = bf.readLine();
			System.out.println("���� �Է�");
			int i = Integer.parseInt(bf.readLine());
			
			System.out.println("ĥ���� " + s + "///"+ i);
			
			bf.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		

	}

}
