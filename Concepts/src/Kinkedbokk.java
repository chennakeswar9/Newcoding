import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Kinkedbokk {
		int id;
		public Kinkedbokk(int id, String name, String author, String publisher, int quantity) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
		}




		String name,author,publisher;
		int quantity;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Book> map = new LinkedHashMap<Integer, Book>();
		Book b1= new Book(1,"chenna","keswar","kudumu",10);
		Book b2= new Book(2,"suresh","kumar","kundi",20);
		Book b3= new Book(3,"nikhil","kumar","puttiri",30);
		map.put(3, b3);
		map.put(2, b2);
		map.put(1, b1);
		for(Map.Entry<Integer, Book> m:map.entrySet()) {
			int key = m.getKey();
			Book b = m.getValue();
			System.out.println(key);
			System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
		}
	}

	
	}


