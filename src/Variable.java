public class Variable {
    public static void main(String[] args) {

        // VARIABEL
        String name;
        name = "Arif Nur Ramadhan";
        System.out.println(name);  // Arif Nur Ramadhan

        int age = 17;
        System.out.println(age);  // 17

        String addres = "Indonesia";
        System.out.println(addres);  // Indonesia

        // menggunakan kata kunci var
        var fullname = "Arif Nur Ramadhan";
        var age2 = 17;
        var score = 'A';

        System.out.println(fullname);  // Arif Nur Ramadhan
        System.out.println(age2);  // 17
        System.out.println(score);  // A

        // KONSTANTA
        final String application = "Aplikasi Belajar PHP";
        final String owner = "Arif Nur Ramadhan";
        System.out.println(application);
        System.out.println(owner);
    }
}
