import java.util.*;
public class evenorodd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int bitmask=1;
        System.out.println("Enter number");
        int n=sc.nextInt();
        if((n&bitmask)==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}
