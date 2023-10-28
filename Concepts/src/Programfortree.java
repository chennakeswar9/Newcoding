import java.util.Iterator;
import java.util.TreeSet;

public class Programfortree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeSet<String> tree = new TreeSet<>();
			tree.add("che");
			tree.add("nna");
			tree.add("kes");
			tree.add("war");
			Iterator<String> itr=tree.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
			TreeSet<String> tree1 = new TreeSet<>();
			tree1.add("he");
			tree1.add("ca");
			tree1.add("kud");
			Iterator<String> itr1 = tree1.descendingIterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
				
			}
	}

}
