import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Sort {
public static void main(String []args) {
	List<Integer> obj = new ArrayList<Integer>();
	obj.add(0);
	obj.add(1);
	obj.add(3);
	obj.add(2);
	System.out.print(obj.stream().sorted().collect(Collectors.toList()));
}}
