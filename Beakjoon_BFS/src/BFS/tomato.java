package BFS;
import java.util.*;

class tmt_index{
	int x;
	int y;
	
	public tmt_index(int i, int j) {
		this.x = i;
		this.y = j;
	}
}

public class tomato {
	
	public static LinkedList<tmt_index> out_index(LinkedList<tmt_index> box, int i, int j,int row, int column){
		if(i>-1 && i < column) {
			if(j>-1 && j <row) {
				box.add(new tmt_index(i,j));
			}
		}
		
		return box;
	}
	
	public static int[][] r_tmt(int[][] arr, int row, int column){

		ArrayList<Integer> box_size = new ArrayList<>();
		LinkedList<tmt_index> q = new LinkedList<>();
		LinkedList<tmt_index> box = new LinkedList<>();
		ArrayList<LinkedList<tmt_index>> tmt = new ArrayList<>(); //이거 없으면 무한 출력
		int count_day = 0;
		
		//익은 토마토 찾기 
		for(int i = 0; i<column;i++) {
			for(int j = 0; j<row;j++) {
				if (arr[i][j] == 1) {
					q.add(new tmt_index(i,j)); //class를 이용해서 넣기
					
					//익은 토마토와 인접한 것들의 좌표 담기
					//주어진 범위(column*row) 를 벗어난 경우는 입력하지 않음
					box = out_index(box,i,j-1,row,column);
					box = out_index(box,i-1,j,row,column);
					box = out_index(box,i,j+1,row,column);
					box = out_index(box,i+1,j,row,column);
					System.out.println("box size : " + box.size());
					box_size.add(box.size());
					//현재 토마토와 인접한 것들 좌표들을 한 덩어리로 담기 
					  //이거 한 덩어리로 안 담긴다. 그냥 연속되어 들어감 
					tmt.add(box);
				}
			}
		}
		//익은 토마토 출력
		for(int i = 0; i<q.size();i++) {
			tmt_index t = q.get(i);
			System.out.println( "ripen-tmt : "+"("+t.x+","+t.y+")" + " ");
		}
		System.out.println("2---------------------------");
		//-----------------------------------------------
		
		
		// ripen tmt와 인접한 토마토 모두 출력 
		for(int i = 0; i< tmt.size();) {
			LinkedList<tmt_index> r = tmt.get(i);
			for(int j=0;j<r.size();j++) {
				tmt_index tr = r.get(j);
				System.out.println(tr.x + "," + tr.y);
			}
			break;
		}
		
		
		System.out.println("***********************8");
		//dequeue 하고 count_day ++ 하고 값 바꿔주고 또 다시 enqueue
		for(int i = 0; i<tmt.size();i++) {
			LinkedList<tmt_index> m = tmt.get(i); // 덩어리 하나 
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
			tmt.remove(i);
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//열 + 행 순서로 입력받음 
		//토마토 담기
		int row = sc.nextInt(); // 열
		int column = sc.nextInt(); //행
		int[][] arr = new int[column][row];
		
		for(int i = 0; i< column ;i++) {
			for(int j = 0; j<row;j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}

		//토마토 전체 출력 
		for(int i = 0; i< column;i++) {
			for(int j = 0; j<row;j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println("");
	    }
		
		System.out.println("1---------------------------");
		
		arr = r_tmt(arr,row, column);
		arr = r_tmt(arr,row, column);
		
		for(int i = 0; i< column ;i++) {
			for(int j = 0; j<row;j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
		sc.close();
	}

}	
		
		
		
		//1. 익은 토마토 찾기
		//  1-1 여러 개일 경우, 각 경우마다 리스트 생성해서 해야 함 
		//2. 익은 토마토를 (x,y)라고 가정할 때, 인접한 토마토 enqueue
		//  2-1 (x,y-1) (x-1,y-1) (x,y+1) (x+1, y+1)
		//3. 인접했던 모든 토마토 출력 (이 문제는 동시성이 중요하다)
		//4. 3에서 출력했던 값이 0일 경우, 1로 바꿔주고  그 외의 경우는 pass
		//5. cnt_day ++;
 		//6. 반복
		
		
		
		
		
	

