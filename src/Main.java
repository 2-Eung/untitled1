public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(++a);
        System.out.println(--b);
        System.out.println(a++);
        System.out.println(b--);
        System.out.println(a);
        System.out.println(b);

        int c = a++; // 후위연산, 할당 후 증가
        System.out.println(c + ", " + a);
    }
}