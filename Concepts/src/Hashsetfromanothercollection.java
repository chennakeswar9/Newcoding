import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashsetfromanothercollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =new ArrayList<>();
		list.add("che");
		list.add("nna");
		list.add("kes");
		list.add("war");
		
		HashSet<String> set = new HashSet(list);
		set.add("kud");
		Iterator<String> itr =set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
