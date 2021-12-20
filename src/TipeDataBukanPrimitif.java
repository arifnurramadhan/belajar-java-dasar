public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;
        System.out.println(iniByte);  // null

        iniByte = 100;
        System.out.println(iniByte);  // 100

        int iniInt = 150;
        Integer iniInteger2 = iniInt;
        System.out.println(iniInteger2);  // 150

        // Konversi tipe data ke primitif
        Integer iniObject = iniInt;
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
        double iniDouble = iniObject.doubleValue();
        String iniString = iniObject.toString();

        System.out.println(iniShort);  // 150
        System.out.println(iniLong2);  // 150
        System.out.println(iniFloat);  // 150.0
        System.out.println(iniDouble);  // 150.0
        System.out.println(iniString);  // 150

    }
}
