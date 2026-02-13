import java.util.*;
import java.util.Scanner;

public class digit_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
       int f = getDigitFrequency(n,d);
       System.out.println(f);

      
    }
     public static int getDigitFrequency(int n, int d){
        int freq = 0;
        while (n>0){
            int dig = n %10;
            n = n/10;
            if (dig ==d){
                freq ++;
            }

        }
        return freq;
       }
}
