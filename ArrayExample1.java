package arrayprogramm;

public class ArrayExample1 {

    public static void sumofArray(int []arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void MaxValue(int []arr){
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>ans){
                ans=arr[i];     
            }
        }
        System.out.println(ans);
    }
    public static void SearchArr(int[]arr)
    {
        int searchnum=5;
       int ans=-1;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==searchnum)
        {
            // System.out.println("number is present at the index of "+i);
            ans=i;
            break;
        }
        }
        System.out.println("found at index in "+ans);
    }
     public static void main(String[] args) {
        int []arr={2,4,6,8};
        // sumofArray(arr);
        // MaxValue(arr);
     SearchArr(arr); 

    }
}
