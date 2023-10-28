import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Convertlisttoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("che");
		list.add("nna");
		list.add("kes");
		list.add("war");
		String[] array =list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(array));
		System.out.println(list);
	}
	
	

}
