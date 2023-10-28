public class ReverseStringRecursive {
   
 
//    public String recursiveReverse(String orig) {
//        if (orig.length() == 1)
//            return orig;
//        else
//            return orig.charAt(orig.length() - 1) + 
//                          recursiveReverse(orig.substring(0, orig.length() - 1));
// 
//    }
//    public static void main(String[] args) {
//        ReverseStringRecursive rsr = new ReverseStringRecursive();
//        String blogName = "chennakeswar";
//        String reverse = rsr.recursiveReverse(blogName);
//        System.out.println(reverse);
	
	public String reverse(String name)
	{
		if(name.length()==1)
		return name;
		else
			return name.charAt(name.length()-1)+ reverse(name.substring(0, name.length()-1));
		
	}
	public static void main(String args[]) {
		ReverseStringRecursive obj = new ReverseStringRecursive();
		String blog = "chennakeswar";
		String rev = obj.reverse(blog);
		System.out.print(rev);
	}
    }

