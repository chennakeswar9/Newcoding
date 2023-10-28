import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1= new Student(1,"chenna",10);
			Student s2= new Student(2,"keswar",20);
			Student s3= new Student(3,"kudumu",30);
			
			ArrayList<Student> list = new ArrayList<>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			Iterator itr=list.iterator();
			while(itr.hasNext()) {
				Student st= (Student) itr.next();
				System.out.println(st.roilno);
				System.out.println(st.age);
				System.out.println(st.name);
			}
			System.out.println(".............linkedlist.........................");
			LinkedList<Student> list1 = new LinkedList<>();
			list1.add(s1);
			list1.add(s2);
			list1.add(s3);
			Iterator itr1=list1.iterator();
			while(itr1.hasNext()) {
				Student st= (Student) itr1.next();
				System.out.println(st.roilno);
				System.out.println(st.age);
				System.out.println(st.name);
	}
			System.out.println("............hashset..........................");
			HashSet<Student> list2 = new HashSet<>();
			list2.add(s1);
			list2.add(s2);
			list2.add(s3);
			Iterator itr2=list2.iterator();
			while(itr2.hasNext()) {
				Student st= (Student) itr2.next();
				System.out.println(st.roilno);
				System.out.println(st.age);
				System.out.println(st.name);
	}
			System.out.println("..............Linkedhashset........................");
			LinkedHashSet<Student> set=new LinkedHashSet<>();
			set.add(s1);
			set.add(s2);
			set.add(s3);
			
			
			Iterator<Student> itr4=set.iterator();
			while(itr4.hasNext()) {
				Student st = itr4.next();
				System.out.println(st.roilno);
				System.out.println(st.name);
				System.out.println(st.age);
				
			}
//			System.out.println("..............Treeset........................");
//			TreeSet<Student> tree=new TreeSet<>();
//			tree.add(s1);
//			tree.add(s2);
//			tree.add(s3);
//			Iterator<Student> itr5 = tree.iterator();
//			while(itr5.hasNext()) {
//				Student st = itr5.next();
//				System.out.println(st.roilno);
//				System.out.println(st.name);
//				System.out.println(st.age);
//			}
	}
}
