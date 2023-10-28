import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Iterate {
	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(2, "chenna");
		map.put(2, "keswar");
		map.put(3, "kudumu");
		Iterator<Entry<Integer, String>> itr=	map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String>	entry = (Entry<Integer, String>) itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		for(Map.Entry<Integer, String>	maping:map.entrySet())
		{
			System.out.println(maping.getKey());
			System.out.println(maping.getValue());
		}
	}
}
