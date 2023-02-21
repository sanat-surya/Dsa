package arrayprogramm;

import java.util.Scanner;
public class RotationofaMatrix {
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
    public static void rotateanArray(int [][]arr) {
       int[][] transe= traspose(arr);
   int[][] ans=reverse(transe);
       printanArray(ans);
    }
    static int[][] traspose(int [][]arr)
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
    static int [][] reverse(int [][]arr)
    {
        for(int i=0;i<arr.length;i++){//for the row traversing
            int left=0,right=arr.length-1;//for the column traversing
        while(left<right)
        {
            int temp=arr[i][left];
            arr[i][left]=arr[i][right];
            arr[i][right]=temp;
            left++;
            right--;
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
    rotateanArray(arr);
    }
}
