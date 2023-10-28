import java.util.HashSet;
import java.util.stream.Collectors;
public class Simple {
public static void main(String []args) {
	HashSet<String> set= new HashSet<>();
	set.add("one");
	set.add("two");
	set.add("one");
	System.out.println(set.stream().collect(Collectors.toSet()));
}}
