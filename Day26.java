public class Day26 {
    public static void main(String[] args) {
        // Contoh Operator Penugasan Aritmatika
        int a = 10;
        System.out.println("=== Operator Penugasan Aritmatika ===");
        System.out.println("Nilai awal a = " + a);

        a += 5; 
        System.out.println("a += 5 -> " + a);

        a *= 2; 
        System.out.println("a *= 2 -> " + a);

        // Contoh Operator Penugasan Bitwise
        int b = 6; // biner 0110
        System.out.println("\n=== Operator Penugasan Bitwise ===");
        System.out.println("Nilai awal b = " + b);

        b &= 3; 
        System.out.println("b &= 3 -> " + b);

        b <<= 1; 
        System.out.println("b <<= 1 -> " + b);
    }
}
