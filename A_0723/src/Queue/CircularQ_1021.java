package Queue;
import java.util.*;

public class CircularQ_1021{
   
   public static void main(String[] args) {
      LinkedList <Integer> deque = new LinkedList<Integer>();
      Scanner sc = new Scanner(System.in);
      ArrayList <Integer> res = new ArrayList<Integer>();
      
      int n = sc.nextInt(); 
      int m = sc.nextInt(); 
      int [] pick = new int[m];
      
      
      //결과값으로 나와야 할 수를 arr에 넣음 
      for(int i = 0; i < m;i++) {
         pick[i] = sc.nextInt();
      }
      
      //q 만들기 : 1 ~ N까지 숫자 넣기
      for(int i = 1; i< n+1;i++) {
         deque.offer(i);
      }
      
      System.out.println("---------------------");
      int half = 0;
      int cnt = 0;
      
      for (int i = 0; i < pick.length; i++) { 
         if (deque.size() % 2 == 0) {
            half = (deque.size()/2) - 1;
         }else {
            half = deque.size() / 2; 
         }
         
         int pick_index = 0; 
         for (int j = 0; j < deque.size(); j++) {
            if (deque.get(j) == pick[i]) {
               pick_index = j;
               break;
            }
         }
         
         if (half - pick_index >= 0) { //pick_index가 half보다 앞에 있는 경우
            for (int j = 0; j < pick_index; j++) {
               int first = deque.pollFirst();
               deque.addLast(first);
               cnt++;
            }
            deque.poll(); // 결과값을 deque에서 제거 // pollFirst
         } else { 
            for (int j = 0; j < deque.size() - pick_index; j++) {
               int last = deque.pollLast();
               deque.addFirst(last);
               cnt++;
            }
            deque.poll();
         }
      }
      System.out.println(cnt);
      
   }

}
