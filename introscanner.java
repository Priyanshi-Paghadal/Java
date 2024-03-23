import java.util.Scanner;

class introscanner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        String name;
        int rno;
        float percentage;
        System.out.println("Enter Your Name :");
        name = sc.nextLine();
        System.out.println("Enter Your Roll No :");
        rno = sc.nextInt();
        System.out.println("Enter Your Percentage :");
        percentage = sc.nextFloat();
        System.out.println(" Name :"+name+"\n rno :"+rno+"\n percentage :"+percentage);
    }
}