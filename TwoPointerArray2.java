package arrayprogramm;
import java.util.Scanner;

public class TwoPointerArray2 {
    
   
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
        // public static void sortZeroesAndOneInPlace(int arr[],int n)
        // {
        // int i=0,j=n-1;         
        // while(i<j)
        // {
        //     if(arr[i]==1 && arr[j]==0){
        //         swap(arr, i, j);
        //         i++;
        //         j--;
        //     }
        //     if(arr[i]==0)
        //     {
        //         i++;
        //     }
        //     if(arr[j]==1)
        //     {
        //         j--;
        //     }
           
        // }
        // printAnArray(arr);
        //    }
            public static void  sortEvenAndoddInPlace(int []arr,int n)
            {
                int i=0,j=n-1;
                while(i<j)
                {
                    if(arr[i]%2==0)
                    {
                        i++;
                    }
                    if(arr[j]%2!=0)
                    {
                        j--;
                    }
                    if(arr[i]%2!=0 && arr[j]%2==0)
                    {
                        swap(arr, i, j);
                        i++;
                        j--;
                    }
                }
                printAnArray(arr);
                
            }
            public static void reverse(int []arr)
            {
                int n=arr.length;
              int i=0,j=arr.length-1;
               while(i<j)
               {
                swap(arr, i, j);
                i++;
                j--;
               }
            }
            public static int[] sortSquare(int []arr,int n)
            {
                int i=0,j=n-1;
                int []ans=new int[n];
                int k=0;
                while(i<=j)
                {
                    if(Math.abs(arr[i])>Math.abs(arr[j]))
                    {
                        ans[k++]=arr[i]*arr[i];
                        i++;
                    }
                    else
                    {
                        ans[k++]=arr[j]*arr[j];
                        j--;
                    }
                }
                return ans;
                
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
    
                // sortZeroesAndOneInPlace(arr,size);
                // sortEvenAndoddInPlace(arr, size);
               int []ans= sortSquare(arr, size);
               reverse(ans);
            printAnArray(ans);
                
        }
    }

   
    

