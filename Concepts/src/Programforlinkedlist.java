import java.util.Iterator;
import java.util.LinkedList;

public class Programforlinkedlist {
public static void main(String []args) {
	LinkedList<Integer> list=new LinkedList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
}
}
