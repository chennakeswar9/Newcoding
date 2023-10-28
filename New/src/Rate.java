
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rate {
	
public static void main(String[] args)
{
	String[]	input= {"dddddddddddd","wfwfr","gggggggggggggggg"};
	
	Stream<String> result = Arrays.stream(input)
	        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	        .entrySet()
	        .stream()
	        .filter(entry -> entry.getValue() > 1)
	        .map(Map.Entry::getKey);

	result.forEach(word -> System.out.println("Duplicate word: " + word));
	
	
}
}
	
	
	
	
