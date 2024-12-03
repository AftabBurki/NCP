import java.util.Scanner;
public class TransPoseMethod {
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int colms = sc.nextInt();
        int mainMatrix[][] = new int[rows][colms];
        //input Method
        inputMatrix(mainMatrix,sc);
        //display Method
        displayMatrix(mainMatrix);
        //Transpse Matrix
        int transposeMatrix[][] = transposedMatrix(mainMatrix,rows,colms);
        //display Transpse 
        displayTransMatrix(transposeMatrix);

    }//END OF MAIN

    //input Method
public static void inputMatrix(int orgMatrix[][],Scanner sc)
{
    System.out.println("Enter the Elements of Array");
    for(int i=0;i<orgMatrix.length;i++)
    {
        for(int j=0;j<orgMatrix[i].length;j++)
        {
            orgMatrix[i][j]=sc.nextInt();
        }
    }
}
  //Display Method
public static void displayMatrix(int orgMatrix[][])
{
    System.out.println("The Origional Matrix is ");
    for(int i=0;i<orgMatrix.length;i++)
    {
        for(int j=0;j<orgMatrix[i].length;j++)
        {
            System.out.print(orgMatrix[i][j] + " ");
        }
        System.out.println();
    }
    
}

//Transpse Method
public static int[][] transposedMatrix(int orgMatrix [][],int r,int c ){
    int tempMatrix[][]=new int[c][r];
    for(int i=0;i<orgMatrix.length;i++){
       for(int j=0;j<orgMatrix[i].length;j++){
        tempMatrix[i][j] = orgMatrix[j][i];
       }
    }
    return tempMatrix;
}

 //Display Transpose Matrix
 public static void displayTransMatrix(int transMatrix[][])
 {
     System.out.println("The Transpose of Matrix is ");
        for (int[] transMatrix1 : transMatrix) {
            for (int j = 0; j < transMatrix1.length; j++) {
                System.out.print(transMatrix1[j] + " ");
            }
            System.out.println();
        }
     
 }

}//END OF CLASS
