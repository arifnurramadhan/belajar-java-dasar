public class SwitchYield {
    public static void main(String[] args) {

        var nilai = "B";
        String output = switch (nilai) {
            case "A":
                yield "Selamat anda lulus dengan sangat baik";
            case "B":
            case "C":
                yield "Anda lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Anda salah jurusan";
        };

        System.out.println(output);
    }
}
