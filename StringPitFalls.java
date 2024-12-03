public class StringPitFalls {
    public static void main(String [] srgs){
        // Other pitfalls with Strings
        //1. Be Careful with String Concatenation
        /*When combining strings with other values, the order of operations matters.
        Example in the Image:
        4 + 2 + " is the answer to everything":
        The 4 + 2 is evaluated first (as it's a mathematical operation),
         resulting in 6.
        Then, 6 is concatenated with the string " is the answer to everything".
        Result: "6 is the answer to everything"
        "The answer to everything is " + 4 + 2:
        In this case, the string "The answer to everything is " comes first.
        The numbers 4 and 2 are treated as strings and simply appended.
        Result: "The answer to everything is 42" */
        String str1 = "Java Programming takes Time of " + 3 + 4 + (" Months");
        System.out.println(str1); // Actual Output => Java Programming takes Time of 34 Months
                                 // expected Output =>Java Programming takes Time of 7 Months 
        String str2 = 2 + 4 + " Months takes by Java programming to learn "; 
        System.out.println(str2); // Real Output: 6 Takes by Java programming to learn
        System.out.println();
        System.out.println(4 + 2 + " is the answer to everything"); // Outputs: "6 is the answer to everything"
        System.out.println("The answer to everything is " + (4 + 2)); // Using Palenthesis Outputs: "The answer to everything is 6"
        System.out.println("The answer to everything is " + 4 + 2); // without Using Palenthesis Outputs: "The answer to everything is 42"
        
        ////////////////////////////////////////////////////////////////////
         //2. Strings are Immutable
      /*In Java, strings are immutable, meaning their values cannot be
       changed after they are created. Any operation that seems to
        "modify" a string actually creates a new string. 
        At first, immutable points to "Yes".
       When you assign "No", a new string "No" is created, and immutable now points
      to this new string.
     Key Point: You are not changing the original string ("Yes"); instead,
     you're reassigning the variable immutable to a new string.*/
     // Example
        String immutable = "Yes";
        immutable = "No"; // This is allowed because Strings are immutable
        System.out.println(immutable); // Outputs: No

        char ch = str1.charAt(5);
        System.out.println(ch); // Outputs: P

        // += operator is allowed for Strings
        String first = "Hello ";
        String second =" World!";
        int total = 3+4;
        first += total;
        // first += second; // This is allowed because Strings are immutable
        System.out.println(first); // Outputs: Hello World  
       
        
    }
}
