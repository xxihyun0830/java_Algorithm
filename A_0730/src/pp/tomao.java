package pp;
import java.util.*;

//토마토 좌표를 담기 위해서 class 이용 
class tmt_index{
	int x;
	int y;
	
	public tmt_index(int i, int j) {
		this.x = i;
		this.y = j;
	}
}

public class tomao {
	
	//메소드 : out_index
	// 토마토상자의 범위를 벗어나는 좌표는 box에 들어가지 않게 하는 메소드
	// out_index
	public static LinkedList<tmt_index> out_index(LinkedList<tmt_index> box, int i, int j,int row, int column){
		if(i>-1 && i < column) {
			if(j>-1 && j <row) {
				box.add(new tmt_index(i,j));
			}
		}
		return box;
	}
	
	// 메소드 : r_tmt
	// 토마토 상자 구현 
	public static int[][] r_tmt(int[][] arr, int row, int column){
		
		LinkedList<tmt_index> q = new LinkedList<>(); // 익은 토마토 넣기 
		LinkedList<tmt_index> box = new LinkedList<>(); // q와 인접한 토마토 넣기
		ArrayList<LinkedList<tmt_index>> tmt = new ArrayList<>(); //이거 없으면 무한 출력
		int count_day = 0;
		
		
		// 익은 토마토 찾기 
		// 좌표를 하나의 인스턴스로 받아서 LinkedList에 추가. 즉, LinkedList의 인덱스 하나의 값은 좌표 한 덩어리임.
		for(int i = 0; i<column;i++) {
			for(int j = 0; j<row;j++) {
				if (arr[i][j] == 1) {
					q.add(new tmt_index(i,j));
					
					//익은 토마토의 인접한 것들의 좌표를 box에 담기
					//주어진 범위(column*row) 를 벗어난 경우는 입력하지 않음
					box = out_index(box,i,j-1,row,column);
					box = out_index(box,i-1,j,row,column);
					box = out_index(box,i,j+1,row,column);
					box = out_index(box,i+1,j,row,column);
										
					tmt.add(box);
				}
			}
			
		}
		System.out.println("box size(익은 토마토와 인접한 것들의 총 갯수) : " + box.size());
		
		
		//익은 토마토 출력
		for(int i = 0; i<q.size();i++) {
			tmt_index t = q.get(i);
			System.out.println( "ripe-tmt : "+"("+t.x+","+t.y+")" + " ");
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
	// 여기가 Main!!!
	//main 메소드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//열 + 행 순서로 입력받음 
		//토마토 담기
		int row = sc.nextInt(); // 열
		int column = sc.nextInt(); //행
		int[][] arr = new int[column][row];
		
		//전체 토마토 상태 정하기
		for(int i = 0; i< column ;i++) {
			for(int j = 0; j<row;j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}

		//토마토 전체 출력 
		System.out.println("1.토마토 전체 출력  ------");
		for(int i = 0; i< column;i++) {
			for(int j = 0; j<row;j++) {
				System.out.print(arr[i][j] + "  "); //backjoon에서는 띄어쓰기 안 함
			}
			System.out.println("");
	    }
		System.out.println();
		
		
		// 토마토 문제 풀기~
		arr = r_tmt(arr,row, column);
		//arr = r_tmt(arr,row, column);
		//arr = r_tmt(arr,row, column);
		
		System.out.println("///////////////////////////////");
		
		//토마토 숙성 최종 결과물
		for(int i = 0; i< column;i++) {
			for(int j = 0; j<row;j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println("");
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
		
		
		
		
		
	

