
import java.util.*;
import java.util.Scanner;
 class decimal_anybase {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;

    int n = sc.nextInt();
    int b = sc.nextInt();
    int dn = getValueInBase(n,b);
    sc.close();
    System.out.println(dn);

    }
     public static int getValueInBase(int n, int b)
    {
        int p = 1;
        int rv = 0;
        while (n>0){
            int dig = n% b;
            n = n/b;
            rv += dig *p;
             p = p*10;
        }
        return rv;

    }
    
}
