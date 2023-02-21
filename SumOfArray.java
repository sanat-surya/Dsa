package arrayprogramm;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthDesktopPaneUI;

public class SumOfArray { 

    //find the total number of pairs in the array whose sum is equal to the given value x
    static void sumOfArray(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                    count++;
                }
            }

        }
        System.out.println(count);

    }
    //count the number of triplets whose sum is equal to the given value x

    static void sumOfArray1(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    //find the unique number in a given array where al the element are being repeated twice with one value being unique

        public static void uniqueArray(int arr[])
        {
            int ans=-1;
                for(int i=0;i<arr.length;i++)
                {
                    for(int j=1;j<arr.length;j++)
                    {
                        if(arr[i]==arr[j]){
                            arr[i]=ans;
                            arr[j]=ans;
                        }
                        else{
                            System.out.println(arr[i]);
                        }
                    }
                }
        }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the number of an array");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    // System.out.println("enter the targeted value");
    //     int targetedValue=sc.nextInt();
    //     // sumOfArray(arr, targetedValue);
        // sumOfArray1(arr, targetedValue);
        uniqueArray(arr);
   } 
}
