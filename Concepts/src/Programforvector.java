import java.util.Iterator;
import java.util.Vector;

public class Programforvector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> vect=new Vector<>();
		vect.add(1);
		vect.add(2);
		vect.add(3);
		vect.add(4);
		
		Iterator itr=vect.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
