package Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class Fourte {
    Scanner sc=new Scanner(System.in);
    static int num1,num2;
    int i,result;
    public int selectOperation()
    {
        System.out.println("Enter an opertaor:{ + , - , * , / , C}");
        char operator=sc.next().charAt(0);
        System.out.println("Choose an integer:");
        num2=sc.nextInt();
        switch (operator)
        {
            case '+': num1=num1+num2;
            break;

            case '-': num1=num1-num2;
            break;

            case '*': num1=num1*num2;
            break;

            case '/': num1=num1/num2;
            break;

            case 'c':num1=num1*10+num2;
        }
        System.out.println("Previous result : "+num1);
        return num1;
    }
    public int gamePlay()
    {
        i=0;
        System.out.println("Choose an integer:");
        num1=sc.nextInt();
        for(i=1;i<4;i++)
        {
            result=selectOperation();
            num1=result;
        }
        System.out.println("Final result : "+result);
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the resultant number:");
        int resultant= sc.nextInt();
        int[] integers=new int[4];
        System.out.println("Enter 4 integers:");
        for(int i=0;i<4;i++)
        {
            integers[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(integers));

        Fourte game=new Fourte();


        if(game.gamePlay()==resultant)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Failure");
        }


    }
}
