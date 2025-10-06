import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Tinggi (cm): ");
        int t = s.nextInt();
        System.out.print("Berat (kg): ");
        int b = s.nextInt();

        System.out.println("\n=== Hasil Pengecekan Aturan Keamanan Wahana ===");
        System.out.println("Tinggi > 150 cm : " + (t > 150));
        System.out.println("Berat < 80 kg   : " + (b < 80));

        System.out.println("\nKeterangan:");
        System.out.println("- true  berarti memenuhi syarat");
        System.out.println("- false berarti tidak memenuhi syarat");
        System.out.println("Jika semua true maka Anda bisa naik wahana");
        System.out.println("Jika ada yang false maka Anda tidak bisa naik wahana");
    }
}
