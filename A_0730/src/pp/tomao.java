package pp;
import java.util.*;

//�丶�� ��ǥ�� ��� ���ؼ� class �̿� 
class tmt_index{
	int x;
	int y;
	
	public tmt_index(int i, int j) {
		this.x = i;
		this.y = j;
	}
}

public class tomao {
	
	//�޼ҵ� : out_index
	// �丶������� ������ ����� ��ǥ�� box�� ���� �ʰ� �ϴ� �޼ҵ�
	// out_index
	public static LinkedList<tmt_index> out_index(LinkedList<tmt_index> box, int i, int j,int row, int column){
		if(i>-1 && i < column) {
			if(j>-1 && j <row) {
				box.add(new tmt_index(i,j));
			}
		}
		return box;
	}
	
	// �޼ҵ� : r_tmt
	// �丶�� ���� ���� 
	public static int[][] r_tmt(int[][] arr, int row, int column){
		
		LinkedList<tmt_index> q = new LinkedList<>(); // ���� �丶�� �ֱ� 
		LinkedList<tmt_index> box = new LinkedList<>(); // q�� ������ �丶�� �ֱ�
		ArrayList<LinkedList<tmt_index>> tmt = new ArrayList<>(); //�̰� ������ ���� ���
		int count_day = 0;
		
		
		// ���� �丶�� ã�� 
		// ��ǥ�� �ϳ��� �ν��Ͻ��� �޾Ƽ� LinkedList�� �߰�. ��, LinkedList�� �ε��� �ϳ��� ���� ��ǥ �� �����.
		for(int i = 0; i<column;i++) {
			for(int j = 0; j<row;j++) {
				if (arr[i][j] == 1) {
					q.add(new tmt_index(i,j));
					
					//���� �丶���� ������ �͵��� ��ǥ�� box�� ���
					//�־��� ����(column*row) �� ��� ���� �Է����� ����
					box = out_index(box,i,j-1,row,column);
					box = out_index(box,i-1,j,row,column);
					box = out_index(box,i,j+1,row,column);
					box = out_index(box,i+1,j,row,column);
										
					tmt.add(box);
				}
			}
			
		}
		System.out.println("box size(���� �丶��� ������ �͵��� �� ����) : " + box.size());
		
		
		//���� �丶�� ���
		for(int i = 0; i<q.size();i++) {
			tmt_index t = q.get(i);
			System.out.println( "ripe-tmt : "+"("+t.x+","+t.y+")" + " ");
		}
		System.out.println("2---------------------------");
		//-----------------------------------------------
		
		
		// ripen tmt�� ������ �丶�� ��� ��� 
		for(int i = 0; i< tmt.size();) {
			LinkedList<tmt_index> r = tmt.get(i);
			for(int j=0;j<r.size();j++) {
				tmt_index tr = r.get(j);
				System.out.println(tr.x + "," + tr.y);
			}
			break;
		}
		
		
		System.out.println("***********************8");
		//dequeue �ϰ� count_day ++ �ϰ� �� �ٲ��ְ� �� �ٽ� enqueue
		
		for(int i = 0; i<tmt.size();i++) {
			LinkedList<tmt_index> m = tmt.get(i); // ��� �ϳ� 
			for(int j = 0; j < m.size();j++) {
				tmt_index tm = m.get(j);
				int x = tm.x;
				int y = tm.y;
				
				if(arr[x][y] == 0) {
					arr[x][y] = 1;
				}
				for(int ii = 0; ii< column;ii++) {
					for(int jj = 0; jj<row;jj++) {
						System.out.print(arr[ii][jj] + "  ");
					}
					System.out.println("");
			    }
				System.out.println("#######################");
				
				
			}
			count_day ++;
			tmt.remove(box);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(int i = 0; i< column;i++) {
			for(int j = 0; j<row;j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println("");
	    }
		
		System.out.println("count-day : " + count_day);
		
		return arr;
	}
	
	
	//--------------------------------------------------------------
	// ���Ⱑ Main!!!
	//main �޼ҵ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�� + �� ������ �Է¹��� 
		//�丶�� ���
		int row = sc.nextInt(); // ��
		int column = sc.nextInt(); //��
		int[][] arr = new int[column][row];
		
		//��ü �丶�� ���� ���ϱ�
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
				System.out.print(arr[i][j] + "  "); //backjoon������ ���� �� ��
			}
			System.out.println("");
	    }
		System.out.println();
		
		
		// �丶�� ���� Ǯ��~
		arr = r_tmt(arr,row, column);
		//arr = r_tmt(arr,row, column);
		//arr = r_tmt(arr,row, column);
		
		System.out.println("///////////////////////////////");
		
		//�丶�� ���� ���� �����
		for(int i = 0; i< column;i++) {
			for(int j = 0; j<row;j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println("");
	    }
		sc.close();
	}

}	
		
		
		
		//1. ���� �丶�� ã��
		//  1-1 ���� ���� ���, �� ��츶�� ����Ʈ �����ؼ� �ؾ� �� 
		//2. ���� �丶�並 (x,y)��� ������ ��, ������ �丶�� enqueue
		//  2-1 (x,y-1) (x-1,y-1) (x,y+1) (x+1, y+1)
		//3. �����ߴ� ��� �丶�� ��� (�� ������ ���ü��� �߿��ϴ�)
		//4. 3���� ����ߴ� ���� 0�� ���, 1�� �ٲ��ְ�  �� ���� ���� pass
		//5. cnt_day ++;
 		//6. �ݺ�
		
		
		
		
		
	

