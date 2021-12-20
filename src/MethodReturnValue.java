public class MethodReturnValue {
    public static void main(String[] args) {


    var a = 300;
    var b = 200;
    var c = sum(a, b);

    System.out.println(c);


    }
    static int sum(int value1, int value2) {
        var result = value1 + value2;
        return result;
    }
}
