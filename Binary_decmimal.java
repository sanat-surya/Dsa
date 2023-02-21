package arrayprogramm;
import java.util.*;


 class Binary_decmimal {
    public static void main(String gg[]){
        try{
        // Scanner s = new Scanner(System.in);
        //     System.out.println("enter the number");
        //     Double digit=s.nextDouble();
             int ans=0;//converted decimal number
        int digit =1111;
            int pw=1;//2^0=1 power of 2
            while(digit>0){
                int unit_digit=(digit%10);
                ans=ans+(unit_digit*pw);

                digit/=10;
                pw*=2;
            }
            System.out.println(ans);
        }
        catch(Exception e)
        {
            System.out.println("invalid exception "+e);
        }
        
    }
}