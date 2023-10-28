import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.Size2DSyntax;

public class Adavnce {
	public static void main(String[] args) {
	
	List<Integer> list= new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	for(int list1:list)
	{
		System.out.println(list1);
	}
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	}
}
