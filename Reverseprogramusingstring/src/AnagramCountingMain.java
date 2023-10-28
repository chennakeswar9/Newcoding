//Write a java program to check if two Strings are anagram in java?
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class StringAnagramMain {
// 
////    public  void main(String[] args) {
//// 
//        String word1 = "cloudTechtwitter";
//        String word2 = "TechtwitterCloud";
// 
//        System.out.println(isAnagramUsingStringMethods(word, anagram));
// 
//    }
// 
//    public static boolean isAnagramUsingStringMethods(String word, String anagram) {
//        if (word.length() != anagram.length())
//            return false;
// 
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            int index = anagram.indexOf(c);
//            // If index of any character is -1, then two strings are not anagrams
//            // If index of character is not equal to -1, then remove the chacter from the
//            // String
//            if (index != -1) {
//                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
//            } else
//                return false;
//        }
//        return anagram.isEmpty();
//    }



//		 
//	    public static void main(String[] args) {
////	 
//	        String word = "CloudTechtwitter";
//	        String anagram = "TechtwitterCloud";
//	 
	       
	    
//	 
//	    public static boolean isAnagramUsingArraySort(String word, String anagram) {
//	 
//	        String sortedWord = sortChars(word);
//	        String sortedAnagram = sortChars(anagram);
//	 
//	        return sortedWord.equals(sortedAnagram);
//	    }
//	 
//	    public static String sortChars(String word) {
//	        char[] wordArr = word.toLowerCase().toCharArray();
//	        Arrays.sort(wordArr);
//	        return String.valueOf(wordArr);
//	    }
//	
//	public static Boolean isAnagram(String word1, String word2){
//	    List<String> listWord1 = new ArrayList<>(Arrays.asList(word1.split("")));
//	    List<String> listWord2 = new ArrayList<>(Arrays.asList(word2.split("")));
//	    
//	    Collections.sort(listWord1);
//	    Collections.sort(listWord2);
//	    
//	    word1 = String.join("", listWord1);
//	    word2 = String.join("", listWord2);
//	    
//	    return word1.equals(word2);
//	    System.out.println(isAnagram(word1, word2));
////		 
//
//	}
//	}

public class AnagramCountingMain {
 
    public static void main(String args[])
    {
        boolean isAnagram = isAnagram("Angle","Angle");
        System.out.println(isAnagram);
    }
 
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int count[] = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}



