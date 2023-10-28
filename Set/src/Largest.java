//find 3rd largest

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Largest {
public static void main(String []args) {
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(23);
	list.add(76);
	list.add(45);
	list.add(56);
	System.out.println(list.stream().skip(2).findFirst());
	System.out.print(list.stream().sorted().collect(Collectors.toList()));
	
	
	
}
}
