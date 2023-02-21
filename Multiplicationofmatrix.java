package arrayprogramm;

import java.util.Scanner;

public class Multiplicationofmatrix {
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
    //multiplication of a matrix
    static int[][] mulofMatrix(int arr1[][],int arr2[][],int r1,int c1,int r2,int c2 )
    {
        int mul[][]= new int [r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
               for(int k=0;k<c1;k++)
               {
                mul[i][j]=mul[i][j]+arr1[i][k]*arr2[k][j];
               }
            }
        }
        return mul;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter rows of 1st array" );
    int row=sc.nextInt();
    System.out.println("enter col of ist array");
    int column=sc.nextInt();
    int [][] array1=new int[row][column];
    System.out.println("enter"+ row*column+ "elements for the 1st array");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            array1[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter rows of 2nd array" );
    int row2=sc.nextInt();
    System.out.println("enter col of 2nd array");
    int column2=sc.nextInt();
    int [][] array2=new int[row][column];
    System.out.println("enter"+ row*column +"elements for the 2nd array");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            array2[i][j]=sc.nextInt();
        }
    }
   int ans[][]= mulofMatrix(array1, array2,row,column ,row2,column2);
    printanArray(ans);
    }
}
