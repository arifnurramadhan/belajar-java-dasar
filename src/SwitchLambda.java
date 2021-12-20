public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "E";

        switch(nilai){
            case "A" -> System.out.println("Anda lulus dengan nilai yang sangat baik");
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Anda tidak lulus,");
                System.out.println("Mungkin anda salah jurusan");
                System.out.println("Atau mungkin nilai yang anda tidak memenuhi persayaratan switch");
            }
        }
    }
}
