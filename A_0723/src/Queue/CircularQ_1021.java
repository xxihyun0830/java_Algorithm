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
      
      
      //��������� ���;� �� ���� arr�� ���� 
      for(int i = 0; i < m;i++) {
         pick[i] = sc.nextInt();  // pick = 2,9,5
      }
      
      //q ����� : 1 ~ N���� ���� �ֱ�
      for(int i = 1; i< n+1;i++) {
         deque.offer(i);
      } //deque = 1,2,3,4,5,6,7,8,9,10
      
      System.out.println("---------------------");
      int half = 0;
      int cnt = 0;
      
      for (int i = 0; i < pick.length; i++) { 
    	  
    	 //�ð� �����Ϸ��� ��ü ���� Ž�����ٴ� �߰����� Ž�� 
         if (deque.size() % 2 == 0) { //n = 10
            half = (deque.size()/2) - 1;
         }else {
            half = deque.size() / 2; 
         }
         
         //��������� ���;� �ϴ� ���� �ε��� ���ϱ� 
         int pick_index = 0; 
         
         //
         for (int j = 0; j < deque.size(); j++) {
            if (deque.get(j) == pick[i]) {
               pick_index = j;
               break;
            } //��������� ���;� �ϴ� �ε����� 2
         }
         
         //----->> front /rear ���� ���ϴ� ��
         
       //pick_index�� half���� �տ� �ִ� ��� 
         if (half - pick_index >= 0) { //star front
            for (int j = 0; j < pick_index; j++) {
            	//
               int first = deque.pollFirst();
               deque.addLast(first);
               cnt++;
               
            }
            deque.poll();// ����� ���
            System.out.println( "left : "+ cnt);
            
            System.out.println(deque.toString());
     
            // ������� deque���� ���� // pollFirst
            //
         } 
         //pick_index�� half���� �ڿ� �ִ� ��� 
         else { //start rear
            for (int j = 0; j < deque.size() - pick_index; j++) { 
               int last = deque.pollLast();
               deque.addFirst(last);
               cnt++;
               System.out.println( "right : "+cnt);
               
            }
            deque.poll(); //����� ���
            System.out.println(deque.toString());
         }
         
         
      }
      System.out.println(cnt);
      sc.close();
   }

}
