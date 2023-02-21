package arrayprogramm;
import java.util.Scanner;

public class SumofMatrix {
    static void printanArray(int[][] array)
    {
        for(int row=0;row<array.length;row++)
        {
            for(int column=0;column<array[row].length;column++)
            {
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }
    }
    static int[][] sumofMatrix(int [][]arr1,int [][]arr2,int row ,int column)
    {
        int sum[][]=new int[row][column];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<column;j++)
                {
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            return sum;
    }
    public static void main(String[] args) {   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of rows");
    int row=sc.nextInt();
    System.out.println("Enter number of column");
    int column=sc.nextInt();
    int [][] array1=new int[row][column];
    int [][] array2=new int[row][column];
    System.out.println("enter"+ row*column+ "elements for the 1st array");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            array1[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter"+ row*column +"elements for the 2nd array");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            array2[i][j]=sc.nextInt();
        }
    }
   int ans[][]= sumofMatrix(array1, array2,row,column);
    printanArray(ans);
    
}

}
