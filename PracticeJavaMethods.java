public class PracticeJavaMethods {
     public static void main(String [] args){
      // PitFall Using == with Strings
      // 1. Primitive data Tpes
      // We use == to compare primitive data types like int, double, boolean etc.
      // 2. Objects mean String
      // We use equals() and equalsIgnoreCase() methods to compare objects like String, Arrays etc.

      //1.
       int a = 10;
       int b = 10;
       System.out.println("a==b " +(a== b)); // true
      
      //2.
       String str1 = "      Aftab Burki      ";
       String str2 = "AFTAB BURKI";
       System.out.println(str1.trim());
       System.out.println(str1);
       boolean tf1 = str1.equalsIgnoreCase(str2); // equalIgnoreCase() method is Not Case Sensative
       System.out.println("equalsIgnoreCase() Method "+ tf1); // Return true
       boolean tf2 = str1.equals(str2);  //  equals() method is Case Sensative
       System.out.println(" equals() method Retuen "+tf2); // Return false
    }
}
