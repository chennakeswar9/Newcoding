//How to check if one String is rotation of another String in java?
public class Rotation {
	public static void main(String[] args) {
		 
        System.out.println(
                "CloudTechtwitter and TechtwitterCloud are rotation of each other : " + isRotation("CloudTechtwitter", "TechtwitterCloud"));
        System.out.println(
                "CloudTechtwitter and TechCloudtwitter are rotation of each other : " + isRotation("CloudTechtwitter", "TechCloudtwitter"));
 
    }
 
    public static boolean isRotation(String str, String rotation) {
        String str2 = str + str;
 
        if (str2.contains(rotation)) {
            return true;
        }
        return false;
 
    }
 

}
