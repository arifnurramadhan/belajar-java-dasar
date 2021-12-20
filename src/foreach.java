public class foreach {
    public static void main(String[] args) {


        String[] pemainFutsal = {
                "Didi", "Andika", "Ramadan",
                "Akas", "Wahyu", "Kapol"
        };

        // Menggunakan forloop
        // for (int i = 0; i <= pemainFutsal.length; i++) {
        //    System.out.println(pemainFutsal[i]);
        // }

        System.out.println("FOREACH");

        // Menggunakan foreach
        for (var name : pemainFutsal){
            System.out.println(name);
        }
    }
}
