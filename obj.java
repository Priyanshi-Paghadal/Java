import java.util.Scanner;

class demo{
    int a ,b;
    void neel()
    {
        System.out.println(a+b);
    }
}
class obj{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        demo c1 = new demo();
        System.out.println("Enter a value : ");
        c1.a = sc.nextInt();
        System.out.println("Enter b value : ");
        c1.b = sc.nextInt();
        c1.neel();
    }
}