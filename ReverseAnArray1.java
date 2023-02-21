package arrayprogramm;
import java.util.Scanner;

public class ReverseAnArray1 {
   public static int[] recursiveArray( int arr[],int start,int end)
     {
    //      //reverse an array using recursive function
    //      if(start<end)
    //      {
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         recursiveArray(arr, start+1, end-1);
    //      }
    //     return arr;
    // }
    //with the while loop
     while(start <=end){
        int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

     }
    return arr;

    }
    //traversing array in many way
    public static void reverseanArray(int[] arr)
    {
        int n=arr.length;
       // int ans[]=new int[n];
        //int j=0;
        // for(int i=n-1;i>=0;i--)
        // {
        //     ans[j]=arr[i];//ans[j++]
        //     System.out.println(arr[j]); 
        //     j++;     
        // }
        // int i=n-1,j=0;
        // while(i>=0)
        // {
        //     ans[j++]=arr[i--];
        // }
        // return ans;

        //Inplace reverse array

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=n-1;j>=0;j--)
        //     {
        //         int  temp;
        //         if(arr[i]<arr[j]){
        //           temp =arr[i];
        //         arr[i]=arr[j];
        //        arr[j]=temp;
        //         }

        //     }
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }
    }
    public static void main(String[] args) {
        // int []arr={1,2,3,4,5};
        //  reverseanArray(arr);
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of an array");
         int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.format("Enter %d elements  = ", size);
        for(int i=0;i<arr.length;i++)
        {
             arr[i]=sc.nextInt();    
        }

        recursiveArray(arr,0,size-1);

        System.out.println("\nThe Result");
		for( int i = 0; i < size; i++) 
		{
			System.out.print(arr[i] + "  ");
		}
    }
}
