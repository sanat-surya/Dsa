package arrayprogramm;

import java.util.Scanner;

public class Transposematrix {
    static void printanArray(int [][]arr)
    {
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //1st approach
    static int[][] approach1(int [][]arr)
    {
        int l=arr.length;
        // System.out.println(l);
        int ans[][]=new int[l][l];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                ans[i][j]=arr[j][i];
            }
        }
       return ans;
    }
    //2nd arroach by swpping column and row
    static int[][] approach2(int [][]arr)
    {
        int temp;
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r=sc.nextInt();
        System.out.println( "Enter the number of column");
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("Enter the total :" +r*c+ " element ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    //   int ans[][]=  approach1(arr);
      int ans[][]=approach2(arr);
      printanArray(ans);
    }
}
