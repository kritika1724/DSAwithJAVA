import java.util.Scanner;

public class linearsearch {
    public linearsearch() {
    }

    public static void main(String[] var0) {
        int[] var1 = new int[5];
        Scanner var2 = new Scanner(System.in);

        int var3;
        for(var3 = 0; var3 < var1.length; ++var3) {
            var1[var3] = var2.nextInt();
        }

        System.out.println("Enter key to search");
        var3 = var2.nextInt();

        for(int var4 = 0; var4 < var1.length; ++var4) {
            if (var1[var4] == var3) {
                System.out.println("key is found at position " + (var4 + 1) + " in array");
                break;
            }
        }

        System.out.println("key is not present in array");
    }
}
