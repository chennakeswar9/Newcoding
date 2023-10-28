public class Permulatuons {
 
    static void printPermutn(String str, String ans)
    {
 
     
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            // ith character of str
            char ch = str.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                         str.substring(i + 1);
 
            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String s = "abb";
        printPermutn(s, "");
    }
    

// Function to print all the distinct
// permutations of str
static void printDistinctPermutn1(String str,
                                 String ans)
{

    // If string is empty
    if (str.length() == 0) {

        // print ans
        System.out.print(ans + " ");
        return;
    }

    // Make a boolean array of size '26' which
    // stores false by default and make true
    // at the position which alphabet is being
    // used
    boolean alpha[] = new boolean[26];

    for (int i = 0; i < str.length(); i++) {

        // ith character of str
        char ch = str.charAt(i);

        // Rest of the string after excluding
        // the ith character
        String ros = str.substring(0, i) +
                     str.substring(i + 1);

        // If the character has not been used
        // then recursive call will take place.
        // Otherwise, there will be no recursive
        // call
        if (alpha[ch - 'a'] == false)
            printDistinctPermutn1(ros, ans + ch);
        alpha[ch - 'a'] = true;
    }
}

// Driver code

}

