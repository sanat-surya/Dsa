package arrayprogramm;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javafx.scene.shape.Arc;

public class SubArraySum {
    public static ArrayList<Integer> subArraySum(int []arr,int n,int target){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int start = 0 , end = 0;
        int currSum = 0;
        if(target == 0){
            list.add(-1);
            return list;
        }
        
        while(start < n)
        {
          currSum +=  arr[start];
          if(currSum > target)
          {
              while(currSum > target)
              {
                currSum -=  arr[end];
                end = end + 1;
              }
          }
          
          
          if(currSum == target)
          {
              list.add(end+1);
              list.add(start+1);
              return list;
          }
          
          
         if(currSum < target)
          {
            start ++;  
          }
         
        }
        list.add(-1);
        return list;
    }     
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int n=arr.length;
        int sum=12;
        subArraySum(arr,n, sum);
        
    }
}
