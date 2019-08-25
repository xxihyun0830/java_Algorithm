package Queue;
import java.util.*;

public class CircularQ_1021{
   
   public static void main(String[] args) {
      LinkedList <Integer> deque = new LinkedList<Integer>();
      Scanner sc = new Scanner(System.in);
      ArrayList <Integer> res = new ArrayList<Integer>();
      
      int n = sc.nextInt(); //n = 10
      int m = sc.nextInt();  // m = 3
      int [] pick = new int[m];
      
      
      //결과값으로 나와야 할 수를 arr에 넣음 
      for(int i = 0; i < m;i++) {
         pick[i] = sc.nextInt();  // pick = 2,9,5
      }
      
      //q 만들기 : 1 ~ N까지 숫자 넣기
      for(int i = 1; i< n+1;i++) {
         deque.offer(i);
      } //deque = 1,2,3,4,5,6,7,8,9,10
      
      System.out.println("---------------------");
      int half = 0;
      int cnt = 0;
      
      for (int i = 0; i < pick.length; i++) { 
    	  
    	 //시간 절약하려고 전체 길이 탐색보다는 중간부터 탐색 
         if (deque.size() % 2 == 0) { //n = 10
            half = (deque.size()/2) - 1;
         }else {
            half = deque.size() / 2; 
         }
         
         //결과값으로 나와야 하는 값의 인덱스 구하기 
         int pick_index = 0; 
         
         //
         for (int j = 0; j < deque.size(); j++) {
            if (deque.get(j) == pick[i]) {
               pick_index = j;
               break;
            } //결과값으로 나와야 하는 인덱스가 2
         }
         
         //----->> front /rear 방향 정하는 것
         
       //pick_index가 half보다 앞에 있는 경우 
         if (half - pick_index >= 0) { //star front
            for (int j = 0; j < pick_index; j++) {
            	//
               int first = deque.pollFirst();
               deque.addLast(first);
               cnt++;
               
            }
            deque.poll();// 결과값 출력
            System.out.println( "left : "+ cnt);
            
            System.out.println(deque.toString());
     
            // 결과값을 deque에서 제거 // pollFirst
            //
         } 
         //pick_index가 half보다 뒤에 있는 경우 
         else { //start rear
            for (int j = 0; j < deque.size() - pick_index; j++) { 
               int last = deque.pollLast();
               deque.addFirst(last);
               cnt++;
               System.out.println( "right : "+cnt);
               
            }
            deque.poll(); //결과값 출력
            System.out.println(deque.toString());
         }
         
         
      }
      System.out.println(cnt);
      sc.close();
   }

}
