import java.util.*;
public class reversearray {
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
        //reversearray
        int front=0;
        int back=array.length-1;
        int temp;//temporary variable for swaping
        while(front<=back)
        {
            temp=array[front];
            array[front]=array[back];
            array[back]=temp;
            front++;
            back--;
        }
        //print reversed array
        System.out.println("Reversed array");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(" "+array[i]);
        }

    }
}
