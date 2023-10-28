import java.util.HashSet;
import java.util.Iterator;

public class Programforset {
public static void main(String []args) {
	HashSet<Integer> set=new HashSet<>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	Iterator itr =set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
