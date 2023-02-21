package arrayprogramm;
import java.util.*;

//count the number of occurrences of a particular element x
public class ArrayExample2 {
    static void countOccurrences(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("Occurrence is" + count);
    }
    //find the last occurrence of an element x in given array
    static void lastOccurrence(int arr[],int x)
    {
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                lastIndex=i;
            }
        }
        System.out.println("last occurrence of number at index"+lastIndex);
    }
    //count the number of an elements strictly greater then value x
    static void greaterThen(int arr[],int x)
    {
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
    //check if the given array is sorted or not

    static boolean sorted(int arr[])
    {
        boolean sort=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i]){
               sort= false;
               break;
            }
        }
        return sort;   
    }

    static int[] smallestAndLargestElement(int arr[]){
        Arrays.sort(arr);
        int ans[]={arr[0],arr[arr.length-1]};
        return ans;
        
    }

    public static void main(String gg[]) {
        int []arr={5,8,6,3,2,1};

        int ans[]=smallestAndLargestElement(arr);
        System.out.println("smallest element"+arr[0]);
        System.out.println("largest element"+arr[1]);
    }
}
