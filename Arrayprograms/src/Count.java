import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;

public class Count {
public static void main(String[] args) {
	String str= "my dear friend take care";
	String[] split= str.split("");
	Map<String, Integer> map= new HashMap<String, Integer>();
			for(int i=0;i<split.length;i++) {
				if(map.containsKey(split[i])) {
				int count	=map.get(split[i]);
				map.put(split[i], count+1);
				
				}
				else
				{
					map.put(split[i], 1);
				}
			}
			System.out.println(map);
}
}