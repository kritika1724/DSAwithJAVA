import java.util.*;
public class linearsearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");//input size of array
        int size = sc.nextInt();
        int[] array = new int[size];//create array
        System.out.println("Enter array elements");
        for(int i = 0; i < array.length; ++i)
        {
            array[i] = sc.nextInt();//input array elements
        }
        System.out.println("Enter key to search");
        int key = sc.nextInt();//enter key to be searched
        for(int i = 0; i < array.length; ++i)
        {
            if (array[i] == key)
            {
                System.out.println("key is found at position " + (i + 1) + " in array");
                return;
            }
            else
            {
                continue;
            }
        }
        System.out.println("key is not present in array");
    }
}

