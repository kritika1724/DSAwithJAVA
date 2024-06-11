import java.util.*;
public class maxsubarraysum {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);   
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    int array[] = new int[size];
    System.out.println("Enter array elements");
    for(int i = 0; i < array.length; ++i)
    {
        array[i] = sc.nextInt();//input array elements
    }
    //kadanes algorithm
    int currsum=0;
    int maxsum=0;
    for(int i=0;i<array.length;++i)
    {
        currsum+=array[i];
        if(currsum<0)
        {
            //if currsum becomes less than zero than its better to make currsum=0 rather than any -ve value
            currsum=0;
        }
        if(currsum>maxsum)
        {
            //updating maxsum
            maxsum=currsum;
        }
    }
    System.out.println("Max subarray sum:"+maxsum);


    

    }
}
