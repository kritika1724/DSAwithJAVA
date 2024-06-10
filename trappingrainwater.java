import java.util.*;
public class trappingrainwater {
   public static int trappedwater(int height[]){
    //calculate left max boundary
    int leftmax[]=new int[height.length];
    leftmax[0]=height[0];
    for(int i=1;i<height.length;++i)
    {
        leftmax[i]=Math.max(leftmax[i-1],height[i]);
    }
    int rightmax[]=new int[height.length];
    rightmax[height.length-1]=height[height.length-1];
    for(int i=height.length-2;i>=0;--i)
    {
        rightmax[i]=Math.max(rightmax[i+1],height[i]);
    }
    int sum=0;
    for(int i=0;i<height.length;++i)
    {
     sum+=(Math.min(leftmax[i],rightmax[i])-height[i]);
    }
      return sum;
   }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of array");
    int size=sc.nextInt();
    int heights[]=new int[size];
    for(int i=0;i<heights.length;++i)
    {
        heights[i]=sc.nextInt();
    }
    int total_trapped_water=trappedwater(heights);
    System.out.println("Total trapped water = "+total_trapped_water);
   }
}
