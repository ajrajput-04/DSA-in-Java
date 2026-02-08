import java.util.*;
import java.util.Scanner;

public class no_digits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number");
    int n = sc.nextInt();
    sc.close();
    System.out.print("Number of digits in " + n + " are: ");
    int count = 0;
    int temp = n;
    
    if ( n ==0){
        count =1;
    }

    while (temp !=0){
        temp = temp /10;
        count++;
    } 
    System.out.println(count);
        
    }
    
}
