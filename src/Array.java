public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString= new String[3];
        arrayString[0] = "Arif";
        arrayString[1] = "Nur";
        arrayString[2] = "Ramadhan";

        System.out.println(arrayString[0]);  // Arif
        System.out.println(arrayString[1]);  // Nur
        System.out.println(arrayString[2]);  // Ramadhan

        // Array Initializer

        String[] fullname = {
            "Arif", "Nur", "Ramadhan"
        };

        int[] nilai = {
                80, 90, 75, 80
        };

        System.out.println(fullname.length);  // 3

        // Array didalam Array
        String[][] pejabarbazrn714 = {
                {"SRI", "BADUGA", "MAHA", "RAJA", "PRABU", "MUHAYAR"},
                {"MAHA", "PATIH", "FAUZAN"},
                {"SENOPATI", "IIP"}
        };

        System.out.println(pejabarbazrn714[2][0] + " " + pejabarbazrn714[2][1]);  // SENOPATI IIP
    }
}
