import java.util.HashMap;
import java.util.Map;

public class Oldgeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("chenna", 1);
		map.put("keswat", 2);
		map.put("kudumu", 3);
		for(Map.Entry<String, Integer> m:map.entrySet())
	
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
