import java.util.ArrayDeque;
import java.util.Deque;

public class Programfordequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> que=new ArrayDeque<>();
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		for(Integer que1: que) {
			System.out.println(que1);
		}
	}

}
