import java.util.Scanner;
public class AssendingOrderArray{
    public static void main(String [] args){
        int size;
      System.out.println("Enter the Size of an Array");
      Scanner sc = new Scanner(System.in);
      size = sc.nextInt();
      int arr [] = new int[size];
    //   int orderArray [] = new int[size];
      System.out.println("Enter The Array Integer");
      for(int i=0 ; i<size ;i++ )
      {
        arr[i] = sc.nextInt();
      }

      System.out.println("Unorder Array Integers are");
      for(int j=0;j<arr.length-1;j++)
      {
        System.out.println("arr[" + j + "] = " + arr[j]);
      }
      // Sorting the array in ascending order
      for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
            if (arr[i] > arr[j]) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
      System.out.println("Order Array Integers are");
      for(int j=0;j<arr.length-1;j++)
      {
        System.out.println("orderArray[" + j + "] = " +  arr[j]);
      }

    }
}