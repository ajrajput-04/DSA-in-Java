  import java.util.*;
import java.util.Scanner;

class anybase_decimal {
  

    public static void main(String[] args) {
        System.out.println("\033c");
    Scanner sc = new Scanner(System.in) ;

    int n = sc.nextInt();
    int b = sc.nextInt();
    int dn = getValueInBase(n,b);
    sc.close();
    System.out.println(dn);
}

    public static int getValueInBase( int n , int b){
        int rv = 0;
        int p =1;
        while(0<n){
            int dig = n%10;
            n=n/10;
            rv += dig*p;
            p*=b;
        }

        return rv;
    }
}