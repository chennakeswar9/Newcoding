import java.util.HashMap;
import java.util.Map;

public class Mapcomparebyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("chenna", 1);
		map.put("keswar", 2);
		map.put("kudumu",3);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	}

}
