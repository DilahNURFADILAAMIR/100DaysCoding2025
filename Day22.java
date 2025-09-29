import java.util.Scanner;
public class Day22 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan panjang sisi persegi (cm): ");
            int sisi = input.nextInt();

            int luas = sisi * sisi;

            System.out.println("\n--- Hasil Perhitungan ---");
            System.out.println("Sisi persegi  : " + sisi + " cm");
            System.out.println("Luas persegi  : " + luas + " cm^2");
        }
}
