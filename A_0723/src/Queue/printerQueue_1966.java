package Queue;
import java.util.*;

class ValueComparator implements Comparator<Integer> {
	 
    Map<Integer, Integer> base;
     
    public ValueComparator(Map<Integer, Integer> base) {
        this.base = base;
    }
 
    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(int a, int b) {
        if (base.get(a) >= base.get(b)) { //오름차순 ((<=)) 이렇게 부등호 바꾸기
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}
public class printerQueue_1966 {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<HashMap<Integer, Integer>> list = new ArrayList<HashMap<Integer, Integer>>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int times = sc.nextInt();
		
		while(times != 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			System.out.println("------------------");
			for(int i = 0; i<n;i++) {
				int impo = sc.nextInt();
				map.put(i, impo);
				
			}
			list.add(map);
			
			System.out.println(list.toString());
			System.out.println("-------------------");
			
			times --;
		}
		
		 HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	     ValueComparator bvc =  new ValueComparator(hm);
	     TreeMap<Integer,Integer> sorted_map = new TreeMap<Integer,Integer>(bvc);
	     
	     sorted_map.putAll(map);
	     
	     for(Map.Entry<Integer, Integer> entry : sorted_map.entrySet()) {
	    	 System.out.println(entry.getKey() + ":" + map.get(entry.getKey()));
	     }
		
		sc.close();
		
		

	}

}
