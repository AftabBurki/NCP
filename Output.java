 import java.util.Scanner;
 public class Output {
    public static void main(String[] args)
    {
        String str1 = "Aftab Burki";
        // Positions are
        // A=0 f=1 t=2 a=3 b=4 space=5 B=6 u=7 r=8 k=9 i=10
        char ch1 = str1.charAt(6);
        System.out.print(ch1 + "\n");
        System.out.println("Enter the index of the character you want to find:");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        String str2 = str1.substring(index);
        System.out.println(str2);
        // String str3 = "hello";
        // String str4 = str3.toUpperCase();
        // String str2 = str1.toLowerCase();
        // System.out.println(str2);
        // boolean tf= str1.equals("hello");
        // boolean tf2= str1.equalsIgnoreCase("hello");
    
        // System.out.println(tf2);
        // System.out.println(str4);
        // int count = str1.length();
        // System.out.println(count);
        // System.out.println(tf);
        // str += " Aftab!";
        // int num=100;
        // System.out.println(str + " " + num);
    }
}
//{
//         String str = "Hello, World!";
//         int count =1;
//         for (int i = 0; i < str.length(); i++) {
//             count *= 2;
            
//             System.out.print(count + " ");
//         }
//     System.out.println();
//     System.out.println("Final Count : " + count);
//     } 
// }
