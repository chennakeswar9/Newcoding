//we perform various SortedSetSet operations
import java.util.TreeSet;

public class Performsortset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TreeSet<String> set = new TreeSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		System.out.println(set);
		System.out.println(set.headSet("c"));
		System.out.println(set.subSet("a", "e"));
		System.out.println(set.tailSet("c"));
	}

}
