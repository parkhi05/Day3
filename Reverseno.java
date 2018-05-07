
package reverseno;
import java.util.*;
public class Reverseno {

    public static void main(String[] args) {
       Scanner obj = new Scanner (System.in);
       int org,rev=0,rem;
       System.out.println("Enter the original number :");
       org=obj.nextInt();
       while(org!=0)
       {
           rem = org % 10;
           rev=rev*10 + rem;
           org = org/10;
           
         
           
       }
         System.out.println(rev);
              
    }
    
}
