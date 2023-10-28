import java.util.ArrayList;

public class programforsetandgettheelements {

	public static void main(String []args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.get(0);
		list.set(0, 7);
		System.out.println(list);
	}
}
