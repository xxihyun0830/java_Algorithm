package stack;
/* 1. ArrayList <String> : str / stack / res 생성
 * 2. 레이저 위치 및 갯수 파악하기
 *    for(int i=0; i<str.size();i++){
 *       if(str.get(i)=="( && str.get(i+1)==")){
 *         stack.add("*"); //레이저의 위치이자 갯수
 *         str.remove(i, i+1) // "(,)" 레이저 삭제
 *
 *       }else{
 *          stack.add(str.get(i)); //막대 넣기
 *          //stack = [*(((**)(*)*))(*)]
 *       }
 *    }
 * 3. 잘린 쇠막대 갯수 구하기 -> stack 성질 이용 
 *    int count = 0;
 *    for(int i = 0; i<stack.size();i++){
 *      if(e.equals(")")){ // 어느 막대의 끝을 찾음 -> 막대의 끝점은 res에 들어가지 않음
 *       for(int j= i-1; j>-1;j--){
 *          if(stack.get(j).equals("(")){ //막대의 시작을 찾음! == 막대 하나 끝!
 *             stack.remove(j); //막대의 시작점 삭제!
 *             break; // 탐색 종료
 *          }else{
 *             count ++;
 *          }
 *       }
 *       count += 1; // 최초 레이저에 의해 잘릴 때 2개가 되는데 
 *                      count ++에서 올라가지 않음 
 *      
 *      }else{
 *       res.add(e);
 *      }
 *    
 *    }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class ironbar_10799 {
	
	public void barLength(String str) {
		
	}
}
