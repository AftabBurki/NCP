import java.util.Scanner;
public class Transpose {
    public static void main(String [] args) throws Exception {
    int rows, colms;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number of Rows: ");
    rows = sc.nextInt();
    System.out.print("Enter the Number of Columns: ");
    colms = sc.nextInt();
    int beforeTranspose[][]=new int[rows][colms];
    int afterTranspose[][]=new int[colms][rows];
   
    System.out.println("The Matrix is ");
    for(int i=0;i<beforeTranspose.length;i++){
        for(int j=0;j<afterTranspose.length;j++){
         System.out.print(beforeTranspose[i][j] + " ");
        }
        System.out.println();
    }

    //Convert into transpose
    for(int i=0;i<afterTranspose.length;i++){
        for(int j=0;j<beforeTranspose.length;j++){
            afterTranspose[i][j]=beforeTranspose[j][i];
        }
    }
    System.out.println("The Transpose of Matrix is ");
    for(int i=0;i<afterTranspose.length;i++){
        for(int j=0;j<beforeTranspose.length;j++){
            System.out.print(afterTranspose[i][j]+" ");   
        }
        System.out.println();
    }

}//end of main

// Size of the matrix Function
public static void sizeOfMatrix(int matrix [][]){
    int beforeTranspose[][]=new int[rows][colms];
    int afterTranspose[][]=new int[colms][rows];
}

public void inputMatrix(int [][] matrix) {
    System.out.println("Enter the elements of the matrix:");
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
         matrix[i][j] = sc.nextInt();
        }
    }

}//end of class

public void beforeMatrix(int [][] matrix) {
    

}//end of class

public void afterMatrix(int [][] matrix) {
    

}//end of class

}//end of main




/*
import java.util.Scanner;
public class Transpose {
    public static void main(String [] args) throws Exception {
    int rows, colms;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number of Rows: ");
    rows = sc.nextInt();
    System.out.print("Enter the Number of Columns: ");
    colms = sc.nextInt();
    int beforeTranspose[][]=new int[rows][colms];
    int afterTranspose[][]=new int[colms][rows];
    System.out.println("Enter the elements of the matrix:");
    for(int i=0;i<beforeTranspose.length;i++){
        for(int j=0;j<afterTranspose.length;j++){
         beforeTranspose[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    System.out.println("The Matrix is ");
    for(int i=0;i<beforeTranspose.length;i++){
        for(int j=0;j<afterTranspose.length;j++){
         System.out.print(beforeTranspose[i][j] + " ");
        }
        System.out.println();
    }

    //Convert into transpose
    for(int i=0;i<afterTranspose.length;i++){
        for(int j=0;j<beforeTranspose.length;j++){
            afterTranspose[i][j]=beforeTranspose[j][i];
        }
    }
    System.out.println("The Transpose of Matrix is ");
    for(int i=0;i<afterTranspose.length;i++){
        for(int j=0;j<beforeTranspose.length;j++){
            System.out.print(afterTranspose[i][j]+" ");   
        }
        System.out.println();
    }

}//end of main
}//end of class

*/

