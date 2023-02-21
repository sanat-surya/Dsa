package arrayprogramm;
import java.util.*;

public class decimal_binary {
    public static void main(String gg[]){
        // Scanner s = new Scanner(System.in);
        //     System.out.println("enter the number");
        //     int digit=s.nextInt();
           int ans=0;//converted binary number
        int digit=13;
            int pw=1;//2^0=1 power of 2
            while(digit>0){
                int unit_digit=digit%2;
                ans=ans+(unit_digit*pw);
                digit/=2;
                pw*=10;
            }
            System.out.println(ans);
        }
    }
