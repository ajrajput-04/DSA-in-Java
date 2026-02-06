import java.util.*;
import java.util.Scanner;
public class GCD_LCM_find {
    
    public static void main(String[] args) {
        System.out.print("\033c");
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1 = sc.nextInt();   
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt(); 
        int org_n1 = n1; // store original value of n1 and n2 for later use to find the lcm
        int org_n2 = n2; //   
        sc.close();
        // find the GCD of n1 and n2
        System.out.println("GCD of " + n1 + " & " + n2 + " is : "  ); 
        while(n1 % n2 !=0){
           int rem = n1 % n2;
            n1 =n2;
            n2 = rem; 
        }
        int gcd = n2;
     System.out.println(gcd); 

     // find the LCM of org_n1 and org_n2
     int lcm = (org_n1 *org_n2)/gcd;
     System.out.println("LCM of " + org_n1 + " & " + org_n2 + " is : " + lcm);
    }
}
