import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class StringAllUniqueCharMain {




public static boolean hasAllUniqueChars (String word) {

    HashSet alphaSet=new HashSet();

    for(int index=0;index < word.length(); index ++)   {

        char c =word.charAt(index);

        // If Hashset's add method return false,that means it is already present in HashSet
        if(!alphaSet.add(c))
             return false;
    }

    return true;
}
//By using indexOf and lastIndexOf methods.
public static boolean hasAllUniqueChars1 (String word) {

   for(int index=0;index < word.length(); index ++)   {

       char c =word.charAt(index);
       if(word.indexOf(c)!=word.lastIndexOf(c))
            return false;
   }

   return true;
}

//By using ascii value of character
public static boolean hasAllUniqueChars2 (String word) {
	 
    boolean[] charMap = new boolean[26];

    for(int index=0;index < word.length(); index ++)   {
     // we are substracting char's ascii value to 64, so we get all index
     // from 0 to 25.
        int asciiCode = (int) word.toUpperCase().charAt(index) - 64;

        // If char is not present, it should have false at that index
        if(!charMap[asciiCode])
         charMap[asciiCode] = true;
         else
            return false;
    }

    return true;
}


//Using Java 8

public static void main(String[] args) {

 System.out.println("CloudTechtwitter has all unique chars : "+ hasAllUniqueChars("CloudTechtwitter"));
 System.out.println("Apple has all unique chars : "+ hasAllUniqueChars("apple"));
 System.out.println("index has all unique chars : "+ hasAllUniqueChars("index"));
 System.out.println("world has all unique chars : "+ hasAllUniqueChars("world"));


String word ="CloudTech" ;

boolean value = word.chars().
                        filter(e-> Collections.frequency(word.chars().boxed().
                                collect(Collectors.toList()), e) > 1).count() > 1 ? false: true;

System.out.println("The String has  unique characters ? " + value);

}
}