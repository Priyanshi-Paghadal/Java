import java.util.*;

class max{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System .in);
        int num1,num2,num3;
        System.out.println("Enter value of num1 :");
        num1 = sc.nextInt();
        System.out.println("Enter value of num2 :");
        num2 = sc.nextInt();
        System.out.println("Enter value of num3 :");
        num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3)
        {
            System.out.println("Num1 is max.");
        }
        else if(num2 > num3)
        {
            System.out.println("Num2 is max.");
        }
        else
        {
            System.out.println("Num3 is max.");
        }
    }
}