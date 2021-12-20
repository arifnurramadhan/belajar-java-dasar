public class MethodReturnValue2 {
    public static void main(String[] args) {

        var a = 700;
        var b = 300;

        System.out.println(hitung(a, "+", b));
        System.out.println(hitung(a, "-", b));
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
