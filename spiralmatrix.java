import java.util.*;
public class spiralmatrix {
     public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow&&startcol<=endcol)
        {
            //top
            for(int j=startcol;j<=endcol;++j)
            {
            System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i= startrow+1;i<=endrow;++i)
            {
                System.out.print(matrix[i][endcol]+" ");   
            }
            //bottom
            for(int k=endcol-1;k>=startcol;--k)
            {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.print(matrix[endrow][k]+" ");
            }
            //left
            for(int f=endrow-1;f>startrow;--f)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(matrix[f][startcol]+" ");
            }
            //next iteration
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows");
        int Row=sc.nextInt();
        System.out.println("Enter no. of Columns");
        int Column=sc.nextInt();
        int matrix[][]=new int[Row][Column];
        for(int i=0;i<Row;++i)
        {
            System.out.println("Enter elements for Row "+(i+1)+":");
            for(int j=0;j<Column;++j)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Spiral order");
        printspiral(matrix);

    }
}


