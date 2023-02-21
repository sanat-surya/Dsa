package arrayprogramm;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int sum=12;
        for(int i=1;i<arr.length;i++){
            int ans=arr[i];
            for(int j=i+1;j<arr.length;j++)
            { 
                ans+=arr[j];
                if( ans==sum)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
