package stack;
/* 1. ArrayList <String> : str / stack / res ����
 * 2. ������ ��ġ �� ���� �ľ��ϱ�
 *    for(int i=0; i<str.size();i++){
 *       if(str.get(i)=="( && str.get(i+1)==")){
 *         stack.add("*"); //�������� ��ġ���� ����
 *         str.remove(i, i+1) // "(,)" ������ ����
 *
 *       }else{
 *          stack.add(str.get(i)); //���� �ֱ�
 *          //stack = [*(((**)(*)*))(*)]
 *       }
 *    }
 * 3. �߸� �踷�� ���� ���ϱ� -> stack ���� �̿� 
 *    int count = 0;
 *    for(int i = 0; i<stack.size();i++){
 *      if(e.equals(")")){ // ��� ������ ���� ã�� -> ������ ������ res�� ���� ����
 *       for(int j= i-1; j>-1;j--){
 *          if(stack.get(j).equals("(")){ //������ ������ ã��! == ���� �ϳ� ��!
 *             stack.remove(j); //������ ������ ����!
 *             break; // Ž�� ����
 *          }else{
 *             count ++;
 *          }
 *       }
 *       count += 1; // ���� �������� ���� �߸� �� 2���� �Ǵµ� 
 *                      count ++���� �ö��� ���� 
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
