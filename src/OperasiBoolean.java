public class OperasiBoolean {
    public static void main(String[] args) {

        var nilaiKehadiaran = 90;
        var nilaiUjian = 75;

        boolean lulusKehadiran = nilaiKehadiaran >= 80;
        boolean lulusUjian = nilaiUjian >= 75;

        var lulus = lulusKehadiran && lulusUjian;
        System.out.println(lulus);  // true
    }
}
