import java.util.*;
import java.util.Scanner;

public class dummy {
    
    public static void main(String[] args) {
    System.out.println("\033c");
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine(); // take the spaced string also as input( input stops after pressing enter)
    String s2 = sc.next(); // take input string until a space is not counter
    sc.close();
    System.out.println(s1);
    System.out.println(s2);

    }
}
