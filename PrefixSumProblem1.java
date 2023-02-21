package arrayprogramm;
import java.util.Scanner;

public class PrefixSumProblem1 {
 
/* Given an integer array 'a' return the prefix sum/running sum in the same 
 * array without creating a new array
 */
        static void printanArray(int newArr[])
        {
            for(int i=0;i<newArr.length;i++)
            {
                System.out.println(newArr[i]);
            }
        }
        /* prefix sum with the new array */
   /*  static int[] prefixSum(int []arr,int size)
    {
        int []pref=new int[size];
        pref[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    } */

       /* prefix sum in place */
    static int[] prefixSumInPlace(int[]arr )
        {
           
            for(int i=1;i<arr.length;i++)
            {
                arr[i]=arr[i]+arr[i-1];
            }
            return arr;
        }
        /* suffix sum of the array */
        static void suff(int arr[])
    {
        for(int i=arr.length-2;i>=0;i--)
        {
            arr[i]=arr[i]+arr[i+1];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }    
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int[] arr=new int[size]; 
      System.out.println("enter the element of an array ");
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
    //   int newArr []=prefixSum(arr,size);
    // int newArr[]=prefixSumInPlace(arr);
    //   printanArray(newArr);
      suff(arr);
}
}
