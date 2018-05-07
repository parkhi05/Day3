package sumofdigits;
import java.util.*;

public class Sumofdigits {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int a,last_digit,sum=0;
     System.out.println("Enter the no. : ");
     a=s.nextInt();
     while(a>0)
     {
         last_digit=a%10; //This finds the last digit of a no.
         sum+=last_digit; //this will add the last digit to a new variable - sum
         a=a/10; //This will remove the last digit
       
     }
       System.out.println("The sum is : "+sum);
     }
    
}
