import java.util.Scanner;
public class largestinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");//input size of array
        int size = sc.nextInt();
        int[] array = new int[size];//create array
        for(int i = 0; i < array.length; ++i)
        {
            array[i] = sc.nextInt();//input array elements
        }  
        //find largest
        int largest=array[0];
        int idx=0;
        for(int i=0;i<array.length;++i)
        {
          if(array[i]>largest)
          {
            largest=array[i];
            idx=i;
          }
        }
        System.out.println(largest+" is the largest element in array firstly occured at index "+(idx+1));
    }
}
