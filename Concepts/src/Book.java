import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {
		int id;
		public Book(int id, String name, String author, String publisher, int quantity) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
		}
		String name,author,publisher;
		int quantity;
		
		
	

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(id>o.id) {
			return 1;
		}
		else if(id<o.id)
		{
		return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> set = new TreeSet<>();
		
		Book b1 = new Book(1,"chenna","keswar","kudumu",10);
		Book b2 = new Book(2,"suresh","kumar","kundi",20);
		Book b3 = new Book(3,"nikhil","kumar","puttiri",30);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for(Book o:set) {
			System.out.println(o.id+""+""+o.author+""+o.name+""+o.publisher+""+o.quantity);
		}
	
	}

}
