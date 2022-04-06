package Assessment;
import java.util.Scanner;

public class Sudoku {
    Scanner sc=new Scanner(System.in);
    int[][] sudoku=new int[9][9];
    int[] arr=new int[9];
    public void getArray()
    {
        System.out.println("Enter elements from 1 to 9 in any order");
        for (int i = 0; i < 9; i++)
        {
            arr[i]= sc.nextInt();
        }
    }
    public void swap(int row)
    {
        for(int i=0,count=0;i<9;i++)
        {
            if((i+1)%3==0)
            {
                arr[i]=sudoku[row-3][count];
                count+=3;
            }
            else
                arr[i]=sudoku[row-3][i+1];
        }
    }
    public void fillRemArray(int row,int val)
    {
        for(int i=0;i< val;i++)
        {
            sudoku[row][9-val+i]=arr[i];
        }
    }
    public void row(int row,int val)
    {
        for (int i=val; i < 9; i++) {
            sudoku[row][i-val]=arr[i];
        }
        if(row!=0)
            fillRemArray(row,val);
    }
    public void playSudoku()
    {
        for (int i = 0; i < 9; i++) {
            if(i%3==0 && i!=0)
                swap(i);
            row(i,(i%3)*3);
        }
    }
    public void display()
    {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Sudoku obj=new Sudoku();
        obj.getArray();
        obj.playSudoku();
        obj.display();
    }
}
