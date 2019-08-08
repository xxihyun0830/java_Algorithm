package pp;
import java.util.*;

//토마토 좌표 담을 클래스 생성
class tmt{ 
	int x;
	int y;
	
	public tmt(int i, int j) {
		this.x = i;
		this.y = j;
	}
}

public class p_tmt {
	
	// 1. 익은 토마토 찾기
	//    단, 이미 담았던 것은 다시 담을 수 없음
	//     -> 익은 토마토를 담은 리스트를 기준으로, 반복을 얼마나 할 것인지 판단 가능 
	// ripe_tmt_box
	public static LinkedList<tmt> ripe_tmt_box(LinkedList<tmt> ripe_tmt, int [][] arr, int column, int row){
		
		// 익은 토마토를 담은 리스트를 기준으로 탐색
		// 익은 토마토의 좌표를 하나 꺼내고
		if(ripe_tmt.size() != 0) {
			for(int k = 0; k< ripe_tmt.size();k++) {
				int x = ripe_tmt.get(k).x;
				int y = ripe_tmt.get(k).y;
				
				for (int i = 0; i< column;i++) {
					for(int j = 0; j< row;j++) {
						//새롭게 찾은 익은 토마토를 찾을 때
						if(arr[i][j] == 1) {
							// 꺼낸 좌표 중에서 동일한 게 없을 떄만 추가
							if(x == i && y == j) {
								
							}
						}
					}
				}//전체 탐색 끝
				
			}//익은 토마토 리스트 끝
		}
		
		// 초기상태의 익은 토마토일 경우 
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
	
	
	//2. 인접한 토마토를 주어진 범위에 넘어가지 않게 추가
	// adjoin_indexCheck
	public static LinkedList<tmt> adjoin_indexCheck(LinkedList<tmt> adjoin_tmt,int i, int j, int row, int column){
		if(i>-1 && i < column) {
			if(j>-1 && j <row) {
				adjoin_tmt.add(new tmt(i,j));
			}
		}
		return adjoin_tmt;
	}
	
	
	//3. 인접한 토마토를 모두 출력하면서 0->1로 바꿔주기
	// aging_box
	public static int[][] aging_box(LinkedList<tmt>adjoin_tmt, int[][] arr, int column, int row){
		
		//인접한 토마토의 좌표 꺼내기
		for(int k = 0; k< adjoin_tmt.size(); k++) {
			int x = adjoin_tmt.get(k).x;
			int y = adjoin_tmt.get(k).y;
			
			//전체 탐색
			for (int i = 0; i< column;i++) {
				for(int j = 0; j< row;j++) {
					//꺼낸 좌표와 현재 탐색 위치가 일치하는 경우
					if(x == i && y == j) { 
						if(arr[x][y] == 0) {
							arr[x][y] = 1; //익지 않은 토마토(0)일 경우, 1로 바꿔준다.
						}
					}// 나머지 경우는 pass
				}
			}
		}
		return arr;
	}
	
	
	//################################################
	//################################################
	//Main--------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		LinkedList<tmt> ripe_tmt = new LinkedList<>(); //익은 토마토
		LinkedList<tmt> adjoin_tmt = new LinkedList<>(); //인접한 토마토  
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt(); // 열
		int column = sc.nextInt(); //행
		int[][] arr = new int[column][row];
		
		//전체 토마토 값 정하기
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
				System.out.print(arr[i][j] + "  "); //주어진 조건에서는 띄어쓰기 안 함
			}
			System.out.println("");
	    }
		
		//인접한 토마토를 찾기 위해서 익은 토마토를 찾음
		for (int i = 0; i< column;i++) {
			for(int j = 0; j< row;j++) {
				if (arr[i][j] == 1) {					
					ripe_tmt.add(new tmt(i,j));// 익은 토마토 찾고
					
					adjoin_tmt = adjoin_indexCheck(adjoin_tmt,i,j-1,row,column); // 좌
					adjoin_tmt = adjoin_indexCheck(adjoin_tmt,i-1,j,row,column); // 상
					adjoin_tmt = adjoin_indexCheck(adjoin_tmt,i,j+1,row,column); // 우
					adjoin_tmt = adjoin_indexCheck(adjoin_tmt,i+1,j,row,column); // 하
					//인접한 토마토 모두 담기
					
				}
			}
		}
		System.out.println();
		
		//익은 토마토 출력
		System.out.println("2. 익은 토마토 출력 ---------");
		ripe_tmt = ripe_tmt_box(ripe_tmt, arr, column, row);
		System.out.println(ripe_tmt.size()+"개 ");
		for(int i = 0; i < ripe_tmt.size();i++) {
			System.out.print("(" + ripe_tmt.get(i).x + "," + ripe_tmt.get(i).y + ")" + " ");
		}
		System.out.println();
		System.out.println();
		
		//인접한 토마토 출력
		System.out.println("3. 인접한 토마토 출력 --------- ");
		System.out.println(adjoin_tmt.size()+"개");
		for(int j= 0; j < adjoin_tmt.size(); j++) {
			System.out.print( "(" + adjoin_tmt.get(j).x + "," + adjoin_tmt.get(j).y + ")" + " ");
		}
		System.out.println();
		
		arr = aging_box(adjoin_tmt, arr, column, row);
		
		System.out.println();
		System.out.println("4.숙성과정을 거친 토마토 전체 출력  ------");
		for(int i = 0; i< column;i++) {
			for(int j = 0; j<row;j++) {
				System.out.print(arr[i][j] + "  "); //주어진 조건에서는 띄어쓰기 안 함
			}
			System.out.println("");
	    }
		
		
		
		
		
	}
	

}
