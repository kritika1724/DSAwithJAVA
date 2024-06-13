import java.util.*;
public class getshortestpath {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path");
        //EXAMPLE=WNEENESENNN
        //W=WEST,N=NORTH,E=EAST,S=SOUTH
        String path =sc.nextLine();
        int x=0;
        int y=0;
        for(int i=0;i<path.length();++i)
        {
            char direction=path.charAt(i);
            if(direction=='N')
            {
                y+=1;
            }
            else if(direction=='S')
            {
              y-=1;
            }
            else if(direction=='E')
            {
                x+=1;
            }
            else
            {
                x-=1;
            }
        }//                    ____________________
        // shortest distance =√(x2-x1)^2+(y2-y1)^2
        //x1,y1=0
        int x2=x*x;
        int y2=y*y;
        System.out.println ((float)((Math.sqrt(x2+y2))));
        //Math.sqrt() fxn returns Double value so we have to type caste into Float

    }
}
