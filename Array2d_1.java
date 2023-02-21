package arrayprogramm;

import java.util.Scanner;

public class Array2d_1 {
    //how to print a array
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
    public static void main(String[] args) {
        // int [][]arr={{1,2,3},{3,2,1},{4,5,6}}; by literals
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row=sc.nextInt();
        System.out.println("Enter number of column");
        int column=sc.nextInt();
        int [][] array=new int[row][column];
        System.out.println("enter"+row*column+"elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        printanArray(array);
    }
}
