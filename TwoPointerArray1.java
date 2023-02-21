package arrayprogramm;
import java.util.Scanner;

public class TwoPointerArray1 {
    public static void printAnArray( int []arr){
        //print an array
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    //swap an array
    public static void swap(int []arr,int i,int j )
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //rotate an array (method 1)
    public static void sortAnArray(int arr[])
    {
        int n=arr.length;
        int zero=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0){
            zero++;     
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i<zero)
            {
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }    
    public static void main(String gg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        System.out.println("enter the element of an array");
        int[] arr=new int [size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

            sortAnArray(arr);
            printAnArray(arr);
    }
}
