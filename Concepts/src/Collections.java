import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
public static void main(String []args) {
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
