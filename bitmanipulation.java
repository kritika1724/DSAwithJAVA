import java.util.*;
public class bitmanipulation {
    public static void checksevenodd(int n){
        int bitmask=1;
        if((n&bitmask)==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    public static int getithbit(int n,int i)
    {
        int bitmask=1<<i;
        if((n&bitmask)==0)
        {
            return(0);
        }
        else
        {
            return(1);
        }
    }
    public static int setithbit(int n,int i)
    {
        int bitmask=1<<i;
        return(n|bitmask);
    }
    public static int clearithbit(int n,int i)
    {
        int bitmask=~(1<<i);
       return(n&bitmask);

    }
    public static int updateithbit(int n,int i,int nb)
    {
        n=clearithbit(n,i);
        int bitmask=nb<<i;
        return(n|nb);
        //or
        //if(nb==0)
        // {clearithbit();}
        //else{setithbit();
        // }
    }
    public static void clearlastibits(int n,int i)
    {
        int bitmask = (-1)<<i;
        n=n & bitmask;
        System.out.println(n);
    }
    public static int clearrangeofbits(int n,int start,int end)
    {
      int a=(1)<<(end+1);
      int b=(1<<start)-1;
      System.out.println(a);
      System.out.println(b);
      int bitmask =a|b;
      return (n&bitmask);

    }
    public static boolean check_num_is_power_of_2(int n){
        if((n&(n-1))==0)
        {
            return true;
        }
        return false;
        
    }
    public static int count_set_bits(int n)
    {
        int c=0;
        while(n>0)
        {
          if((n & 1)!=0)
          {
           c+=1;
          }
          n=n>>1;
        }
        return c;
    }
    public static int fastexpo(int a,int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)//check lsb
            {
               ans=ans*a;
            }
            a*=a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      
        //checksevenodd(7);
        //System.out.println(getithbit(8,3));
        //System.out.println(setithbit(8,0));
        System.out.println(clearithbit(9,0));
        //System.out.println(updateithbit(9,0,0));
        //System.out.println(clearlastibits(10, 3));
        //System.out.println(clearrangeofbits(30, 1,3));
        //System.out.println(check_num_is_power_of_2(31));
        //System.out.println(count_set_bits(9));
        //System.out.println(fastexpo(2,5));
    }
}
