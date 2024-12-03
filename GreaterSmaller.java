import java.util.Scanner;
public class GreaterSmaller{
    public static void main(String[] args){
        int smallerNumber, greaterNumber;
        Scanner number = new Scanner(System.in);
        System.out.println("How many numbers you want in Array");
        Integer userNumber = number.nextInt(); 
        int [] arr = new int[userNumber];
        
        for(int i=0; i<userNumber; i++)
        {
            
            System.out.println("Enter Number in an Array "+"[" +i+"]");
            arr[i] = number.nextInt();  //cin>>Array[i];
        }
            smallerNumber=arr[0];
            greaterNumber=arr[userNumber-1];
        for(int j=0;j<userNumber;j++){
            // if(smallerNumber>greaterNumber){
            //     int temp=greaterNumber;
            //     greaterNumber=smallerNumber;
            //     smallerNumber=temp;
            // }
            if(arr[j]<smallerNumber){
                smallerNumber=arr[j];
            }
            
            else if(arr[j]>greaterNumber){
                greaterNumber=arr[j];
            }
        }
        System.out.println("Greater Number is "+greaterNumber);
        System.out.println("Smaller Number is "+smallerNumber);
        // System.out.println("Your Entered Number is :"+userNumber);


        // if(total==5){
        //     System.out.println(total);
        // }
        // else{
        //     System.out.println(total);
        // }
    //    while(total<10){
    //     System.out.println(total);
    //     total++;
    //    }
    //    System.out.println("This is ending of loop "+total);
    }
}