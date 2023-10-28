import java.util.Iterator;
import java.util.Stack;

public class Programforstack {
public static void maiin(String []args) {
	Stack<Integer> stack=new Stack<>();
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.pop();
	Iterator<Integer> itr=stack.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
