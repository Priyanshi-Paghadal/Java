import java.util.Scanner;
class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int i;
        int j;
        System.out.println("Enter anu number : ");
        N = sc.nextInt();
        for(i=0; i<N; i++)
        {
            for(j=N-i; j >=1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
