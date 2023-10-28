import java.util.HashMap;
import java.util.Map;

public class Duplicatebykey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "chenna");
		map.put(2, "keswar");
		map.put(3, "kudumu");
		map.put(1, "ntr");
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
