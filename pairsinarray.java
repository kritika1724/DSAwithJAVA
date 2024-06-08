import java.util.Scanner;

public class pairsinarray {
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");//input size of array
        int size = sc.nextInt();
        int[] array = new int[size];//create sorted array
        System.out.println("Enter array elements");
        for(int i = 0; i < array.length; ++i)
        {
            array[i] = sc.nextInt();//input array elements
        }
        //print pairs
        int c=1;
        for(int i=0;i<array.length;++i)
        {
            for(int j=i+1;j<array.length;++j)
            {
                System.out.println("pair "+c+" is "+"("+array[i]+","+array[j]+")");
                c++;
            }
            
        }
    }
}
