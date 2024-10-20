class logical{
    public static void main(String[] args) {
        int a=30;
        int b=7;
        int c=25;
        System.out.println(a>b && a > c);
        System.out.println(a>b || a > c);
        System.out.println(b>c);
        System.out.println(a==c || (a>b && b>c));
    }
}