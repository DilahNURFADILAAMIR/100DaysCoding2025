public class Day19 {
    public static void main(String[] args) {
        // Narrowing (manual)
        double desimal = 45.75;
        int bulat = (int) desimal;  // desimal dibuang
        System.out.println("Double: " + desimal);
        System.out.println("Ke int (narrowing): " + bulat);

        // Widening (otomatis)
        int angka = 150;
        double angkaDouble = angka; // otomatis
        System.out.println("\nInt: " + angka);
        System.out.println("Ke double (widening): " + angkaDouble);
    }
}
