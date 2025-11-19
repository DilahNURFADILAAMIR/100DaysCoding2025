import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        int total = 0;
        int angka = 0;
        while (angka >= 0) {
            System.out.print("Masukkan angka: ");
            angka = tes.nextInt();
            if (angka >= 0) {
                total = total + angka;
            }
        }
        System.out.println("Perulangan berhenti.");
        System.out.println("Total penjumlahan: " + total);
    }
}
