import java.util.*;
public class rotate_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Enter the number of digits to rotations:");
        int k = sc.nextInt();
        int temp = num;
        int nod = 0;
        while (temp>0){
            temp = temp/10;
            nod++;

        }

        //find perfect divisor and multiplier for the number (num)
        int div = 1;
        int mul = 1;
        for(int i=1; i<=nod; i++){
            if(i<=k){
                div = div*10;  // 100
            }
            else{
                mul = mul *10; //1000
            }


        }

        // find the quotient and remainder
        int q = num/div;
        int r = num%div;
        int rotate_number = r *mul + q;
        System.out.println(rotate_number);
        
    }

}
