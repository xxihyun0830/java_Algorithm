package pp;
import java.util.*;

//�丶�� ��ǥ ���� Ŭ���� ����
class tmt{ 
	int x;
	int y;
	
	public tmt(int i, int j) {
		this.x = i;
		this.y = j;
	}
}

public class p_tmt {
	
	// 1. ���� �丶�� ã��
	//    ��, �̹� ��Ҵ� ���� �ٽ� ���� �� ����
	//     -> ���� �丶�並 ���� ����Ʈ�� ��������, �ݺ��� �󸶳� �� ������ �Ǵ� ���� 
	// ripe_tmt_box
	public static LinkedList<tmt> ripe_tmt_box(LinkedList<tmt> ripe_tmt, int [][] arr, int column, int row){
		
		// ���� �丶�並 ���� ����Ʈ�� �������� Ž��
		// ���� �丶���� ��ǥ�� �ϳ� ������
		if(ripe_tmt.size() != 0) {
			for(int k = 0; k< ripe_tmt.size();k++) {
				int x = ripe_tmt.get(k).x;
				int y = ripe_tmt.get(k).y;
				
				for (int i = 0; i< column;i++) {
					for(int j = 0; j< row;j++) {
						//���Ӱ� ã�� ���� �丶�並 ã�� ��
						if(arr[i][j] == 1) {
							// ���� ��ǥ �߿��� ������ �� ���� ���� �߰�
							if(x == i && y == j) {
								
							}
						}
					}
				}//��ü Ž�� ��
				
			}//���� �丶�� ����Ʈ ��
		}
		
		// �ʱ������ ���� �丶���� ��� 
		else{
			for (int i = 0; i< column;i++) {
				for(int j = 0; j< row;j++) {
					if (arr[i][j] == 1) {
						ripe_tmt.add(new tmt(i,j));
				    }
			    }
		    }
		}
		return ripe_tmt;
	} 
	
	
	//2. ������ �丶�並 �־��� ������ �Ѿ�� �ʰ� �߰�
	// adjoin_indexCheck
	public static LinkedList<tmt> adjoin_indexCheck(LinkedList<tmt> adjoin_tmt,int i, int j, int row, int column){
		if(i>-1 && i < column) {
			if(j>-1 && j <row) {
				adjoin_tmt.add(new tmt(i,j));
			}
		}
		return adjoin_tmt;
	}
	
	
	//3. ������ �丶�並 ��� ����ϸ鼭 0->1�� �ٲ��ֱ�
	// aging_box
	public static int[][] aging_box(LinkedList<tmt>adjoin_tmt, int[][] arr, int column, int row){
		
		//������ �丶���� ��ǥ ������
		for(int k = 0; k< adjoin_tmt.size(); k++) {
			int x = adjoin_tmt.get(k).x;
			int y = adjoin_tmt.get(k).y;
			
			//��ü Ž��
			for (int i = 0; i< column;i++) {
				for(int j = 0; j< row;j++) {
					//���� ��ǥ�� ���� Ž�� ��ġ�� ��ġ�ϴ� ���
					if(x == i && y == j) { 
						if(arr[x][y] == 0) {
							arr[x][y] = 1; //���� ���� �丶��(0)�� ���, 1�� �ٲ��ش�.
						}
					}// ������ ���� pass
				}
			}
		}
		return arr;
	}
	
	
	//################################################
	//################################################
	//Main--------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		LinkedList<tmt> ripe_tmt = new LinkedList<>(); //���� �丶��
		LinkedList<tmt> adjoin_tmt = new LinkedList<>(); //������ �丶��  
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt(); // ��
		int column = sc.nextInt(); //��
		int[][] arr = new int[column][row];
		
		//��ü �丶�� �� ���ϱ�
		for(int i = 0; i< column ;i++) {
			for(int j = 0; j<row;j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}

		//�丶�� ��ü ��� 
		System.out.println("1.�丶�� ��ü ���  ------");
		for(int i = 0; i< column;i++) {
			for(int j = 0; j<row;j++) {
				System.out.print(arr[i][j] + "  "); //�־��� ���ǿ����� ���� �� ��
			}
			System.out.println("");
	    }
		
		//������ �丶�並 ã�� ���ؼ� ���� �丶�並 ã��
		for (int i = 0; i< column;i++) {
			for(int j = 0; j< row;j++) {
				if (arr[i][j] == 1) {					
					ripe_tmt.add(new tmt(i,j));// ���� �丶�� ã��
					
					adjoin_tmt = adjoin_indexCheck(adjoin_tmt,i,j-1,row,column); // ��
					adjoin_tmt = adjoin_indexCheck(adjoin_tmt,i-1,j,row,column); // ��
					adjoin_tmt = adjoin_indexCheck(adjoin_tmt,i,j+1,row,column); // ��
					adjoin_tmt = adjoin_indexCheck(adjoin_tmt,i+1,j,row,column); // ��
					//������ �丶�� ��� ���
					
				}
			}
		}
		System.out.println();
		
		//���� �丶�� ���
		System.out.println("2. ���� �丶�� ��� ---------");
		ripe_tmt = ripe_tmt_box(ripe_tmt, arr, column, row);
		System.out.println(ripe_tmt.size()+"�� ");
		for(int i = 0; i < ripe_tmt.size();i++) {
			System.out.print("(" + ripe_tmt.get(i).x + "," + ripe_tmt.get(i).y + ")" + " ");
		}
		System.out.println();
		System.out.println();
		
		//������ �丶�� ���
		System.out.println("3. ������ �丶�� ��� --------- ");
		System.out.println(adjoin_tmt.size()+"��");
		for(int j= 0; j < adjoin_tmt.size(); j++) {
			System.out.print( "(" + adjoin_tmt.get(j).x + "," + adjoin_tmt.get(j).y + ")" + " ");
		}
		System.out.println();
		
		arr = aging_box(adjoin_tmt, arr, column, row);
		
		System.out.println();
		System.out.println("4.���������� ��ģ �丶�� ��ü ���  ------");
		for(int i = 0; i< column;i++) {
			for(int j = 0; j<row;j++) {
				System.out.print(arr[i][j] + "  "); //�־��� ���ǿ����� ���� �� ��
			}
			System.out.println("");
	    }
		
		
		
		
		
	}
	

}
