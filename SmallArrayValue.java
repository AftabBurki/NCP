import java.util.Scanner;
public class SmallArrayValue {
    public static void main(String [] args){
     int smallest, size=10;
      int smallValue[] = new int[size];
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Array Values: ");
      for(int i=0;i<smallValue.length;i++){
        smallValue[i] = sc.nextInt();
      }
      smallest = smallValue[0];
      
      for(int j=0;j<smallValue.length;j++){
       if(smallValue[j]<smallest){
         smallest = smallValue[j];
       }
      }
      System.out.print("The Smallest Value of Array is = " + smallest);
    }
}
