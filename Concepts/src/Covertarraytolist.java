import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Covertarraytolist {
	public static void main(String []args) {
		
		
		String b[]= {"ca","ad","ae","af"};
	System.out.println(Arrays.toString(b));
	List<String> list=new ArrayList<>();
	for(String lang:b) {
		list.add(lang);
	}
	System.out.println(list);
	
	}
}
