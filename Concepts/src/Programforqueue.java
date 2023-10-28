import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Programforqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> que= new PriorityQueue<>();
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		System.out.println("head"+ que.element());
		System.out.println("head"+ que.peek());
		Iterator itr=que.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		que.remove();
		que.poll();
		System.out.println("after two remove elements");
		Iterator<Integer> itr1=que.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
