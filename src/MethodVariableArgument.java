public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 75, 90, 75, 81, 90};

        sayCongrats("Arif", values);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + " anda dinyatakan lulus!");
        } else {
            System.out.println("Maaf " + name + " anda dinyatakan tidak lulus!");
        }
    }
}
