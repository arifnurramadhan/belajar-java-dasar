public class OperasiAritmatika {
    public static void main(String[] args) {
        int a = 100;
        int b = 5;

        System.out.println(a + b);  // 105
        System.out.println(a - b);  // 95
        System.out.println(a * b);  // 500
        System.out.println(a / b);  // 20
        System.out.println(a % b);  // 0

        // Augmented Assignments
        int c = 100;
        c += 10;
        System.out.println(c);  // 110

        c -= 10;
        System.out.println(c);  // 100

        c *= 10;
        System.out.println(c);  // 1000

        c /= 10;
        System.out.println(c);  // 100

        c %= 10;
        System.out.println(c);  // 0



        // Unary Operator
        int d = 100;
        d++;
        System.out.println(d);  // 101

        d--;
        System.out.println(d);  // 100

    }
}
