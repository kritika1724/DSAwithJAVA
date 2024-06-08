import java.util.Scanner;

public class subarrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");//input size of array
        int size = sc.nextInt();
        int[] array = new int[size];//create sorted array
        System.out.println("Enter array elements");
        for(int i = 0; i < array.length; ++i)
        {
            array[i] = sc.nextInt();//input array elements
        }
        //print subarrays 
        for(int i=0;i<array.length;++i)
        {
            System.out.println("Subarray starting with "+array[i]);
            for(int j=i;j<array.length;++j)
            {
               for(int k=i;k<=j;k++)
               {
                System.out.print(array[k]);
               }
               System.out.println();
            }
        }
}
}
