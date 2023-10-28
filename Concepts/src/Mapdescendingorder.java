import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Mapdescendingorder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("chenna", 1);
		map.put("keswar", 2);
		map.put("kudumu", 3);
		
		
map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
.forEach(System.out::println);
}
}