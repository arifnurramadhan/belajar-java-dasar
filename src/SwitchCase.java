public class SwitchCase {
    public static void main(String[] args) {

        var nilai = 'B';

        switch (nilai) {
            case 'A':
                System.out.println("Anda Lulus dengan Nilai yang sangat baik");
                break;
            case 'B':
            case 'C':
                System.out.println("Anda Lulus");
                break;
            case 'D':
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

    }
}
