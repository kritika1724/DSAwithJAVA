import java.util.*;
public class Twodimensionalarray{
    public static void main(String args[])
    {  Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows");
        int Row=sc.nextInt();
        System.out.println("Enter no. of Columns");
        int Column=sc.nextInt();
        int matrix[][]=new int[Row][Column];
        System.out.println("Total no. of cells = "+(Row*Column));
        for(int i=0;i<Row;++i)
        {
            System.out.println("Enter elements for Row "+(i+1));
            for(int j=0;j<Column;++j)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix of size: "+Row+"X"+Column);
        for(int i=0;i<Row;++i)
        {
            for(int j=0;j<Column;++j)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
