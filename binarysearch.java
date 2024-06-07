import java.util.*;
public class binarysearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");//input size of array
        int size = sc.nextInt();
        int[] array = new int[size];//create sorted array
        for(int i = 0; i < array.length; ++i)
        {
            array[i] = sc.nextInt();//input array elements
        }
        System.out.println("Enter key to search");
        int key = sc.nextInt();//enter key to be searched
        int start=0;
        int end=array.length-1;
        int midelement;
        while(start<=end)
        {
            midelement=(start+end)/2;
            if(array[midelement]==key)
            {
             System.out.println("key is found at index"+(midelement+1));
             break;
            }
            else if(array[midelement]>key)
            {
            end=midelement-1;
            }
            else
            {
            start=midelement+1;
            }
        }
    }
}
