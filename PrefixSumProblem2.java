package arrayprogramm;
import java.util.Scanner;
import java.util.prefs.Preferences;

public class PrefixSumProblem2 {
    static void printanArray(int newArr[])
        {
            for(int i=0;i<newArr.length;i++)
            {
                System.out.println(newArr[i]);
            }
        }
     /* given an array of integers of size n Answer a queries where
      * you need to print the sum of values in a given range of indices
      from l to r(both included)
      Note:-the value of l and r i queries follow 1 based indexing
      */  
      /*   the brute force approach
      public static void prefixSum(int arr[] ,int l,int r)
        {
            int sum=0;
            for(int i=l;i<=r;i++)
            {
                sum=sum+arr[i];
            }
         System.out.println("the sum is :"+sum);
        } */
        /* Throught prefix sum Approach  */
    static int[] makePrefixSumArray(int[]arr )
    {
        for(int i=1;i<arr.length;i++)
        {
          arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
        public static void prefixSum(int arr [],int l,int r)
        {
          int prefsum[]= makePrefixSumArray(arr);
          
            int sum=prefsum[r]-prefsum[l-1];
            System.out.println(sum);
        }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
    int[] arr=new int[size+1]; 
    System.out.println("enter the element of an array ");
    for(int i=1;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("enter the l element ");
    int l=sc.nextInt(size);
    System.out.println("enter the r element ");
    int r=sc.nextInt(size);
    // System.out.println("enter the r element");
    // int newArr []=prefixSumInPlace(arr);
    // printanArray(newArr);
    // int [] pref=prefixSumInPlace(arr);
    // printanArray(pref);
    prefixSum(arr, l, r);
   
    
 }
}
