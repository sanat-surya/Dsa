package arrayprogramm;
import java.util.Scanner;

import javafx.scene.shape.Rectangle;


public class PrefixSumProblem3 {
    static void printanArray(int newArr[])
        {
            for(int i=0;i<newArr.length;i++)
            {
                System.out.println(newArr[i]);
            }
        }
        static int findarraySum(int arr[])
        {
            int totalsum=0;
            for(int i=0;i<arr.length;i++)
            {
             totalsum=totalsum+arr[i];
            }
            return  totalsum;
        }
    static boolean pref(int arr[])
    {
       int totalsum= findarraySum(arr);
        int prefsum=0;
        for(int i=0;i<arr.length;i++)
        {
           prefsum=prefsum+arr[i];
           int suffixsum=totalsum-prefsum;
           if(prefsum==suffixsum)
           {
            return true;
           }
        }
        return false;
       
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elemnt of an array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean newarr= pref(arr);
        if(newarr){
        System.out.println("equal partition is possible:"+newarr );
        }
        else{
            System.out.println("equal partition is not possible:"+newarr);
        }
    }
}
