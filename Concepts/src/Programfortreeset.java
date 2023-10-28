import java.util.Iterator;
import java.util.TreeSet;

public class Programfortreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		Iterator<Integer> itr=tree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
