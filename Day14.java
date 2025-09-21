public class Day14 {
    public static void main(String[] args) {
        String sByte = "7";
        String sShort = "320";
        String sInt = "12000";
        String sLong = "987654";
        String sFloat = "11.5";
        String sDouble = "66.66";
        String sBool = "true";

        byte b = Byte.parseByte(sByte);
        short sh = Short.parseShort(sShort);
        int in = Integer.parseInt(sInt);
        long lo = Long.parseLong(sLong);
        float fl = Float.parseFloat(sFloat);
        double db = Double.parseDouble(sDouble);
        boolean bl = Boolean.parseBoolean(sBool);

        System.out.println("--- Hasil Parsing ---");
        System.out.println("Byte   = " + b);
        System.out.println("Short  = " + sh);
        System.out.println("Int    = " + in);
        System.out.println("Long   = " + lo);
        System.out.println("Float  = " + fl);
        System.out.println("Double = " + db);
        System.out.println("Boolean  = " + bl);
    }
}
