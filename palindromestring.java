import java.util.*;
public class palindromestring {
    public static void main(String[] args) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str1 = sc.nextLine();
        for(int i=0;i<(str1.length())/2;++i)
        {
            if(str1.charAt(i)!=str1.charAt(str1.length()-i-1))
            {
            c=1;
            System.out.println("NOT A PALINDROME");
            break;
            }
        }
        if(c==0)
        {
            System.out.println("PALINDROME STRING");
        }
    }
}
