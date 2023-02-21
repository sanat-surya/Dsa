package arrayprogramm;
import java.util.Scanner;

public class RotateArrayExample1 {
    //here k means how many time we rotate
    public static int [] rotateanArray(int arr[],int size,int k)
    {
        k=k%size;
        int ans[]=new int[size];
        int j=0;                  
            for(int i=size-k ;i<arr.length;i++){
                    ans[j++]=arr[i];
            }
            for(int i=0;i<=size-k-1;i++)
            {
                ans[j++]=arr[i];
            }
    return ans;      
    }
    //rotate an array without using extra space

    public static int [] rotateInPlace(int arr[],int n,int k)
    {
        k=k%n;
        reverse(arr ,0,n-k-1);
        reverse(arr, n-k, n-1);
       reverse(arr, 0, n-1);

       return arr;

    }
    public static void reverse(int arr[],int start,int end)
    {
        while(start<end){
            swapInArray(arr,start,end);
           start++;
           end--;
        }
      
    }
    static void swapInArray( int[] arr,int start ,int end){
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]=arr[start];
    }
   public static  void main(String []args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the k th number");
    int  k=sc.nextInt();
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
   int arr[]= new int[size];

   System.out.println("Enter elements");
   for(int i=0;i<arr.length;i++)
   {
        arr[i]=sc.nextInt();    
   }
//    int []ans=rotateanArray(arr,size,k);
   int [] ans= rotateInPlace(arr, size, k);
   System.out.println("\nThe Result");
   for( int i = 0; i < arr.length; i++) 
   {
       System.out.print(ans[i] + "  ");
   }
   } 
}
