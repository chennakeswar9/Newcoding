//Find length of String without using any inbuilt method in java?
public class LenghtOfStringMain{
 
 public static void main(String args[]){
 
  String helloWorld="This is hello world";
  System.out.println(getLengthOfStringWithCharArray(helloWorld));
  }
 
  public static int getLengthOfStringWithCharArray(String str)
  {
       int length=0;
       char[] strCharArray=str.toCharArray();
       for(char c:strCharArray) {
               length++;
          }
    return length;
  }
  
  public static int getLengthOfString(String str)
  {
    int i=0;
  try{
   for(i=0;;i++)
   {
    str.charAt(i);
   }
 
  }
  catch(Exception e)
  {
 
  }
  return i;
 }
}

