import java.util.Scanner;
class oddeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any num : ");
        num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("Your Number is Even...");
        }
        else{
            System.out.println("Your Number is Odd...");
        }
    }
}