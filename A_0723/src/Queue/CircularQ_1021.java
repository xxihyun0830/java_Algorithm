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
      
      
      //��������� ���;� �� ���� arr�� ���� 
      for(int i = 0; i < m;i++) {
         pick[i] = sc.nextInt();
      }
      
      //q ����� : 1 ~ N���� ���� �ֱ�
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
         
         if (half - pick_index >= 0) { //pick_index�� half���� �տ� �ִ� ���
            for (int j = 0; j < pick_index; j++) {
               int first = deque.pollFirst();
               deque.addLast(first);
               cnt++;
            }
            deque.poll(); // ������� deque���� ���� // pollFirst
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
