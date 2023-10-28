import java.util.TreeSet;

public class Removehighestandlowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<>();
		set.add(24);
		set.add(34);
		set.add(44);
		set.add(54);
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		
	}

}
