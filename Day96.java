import java.util.Scanner;
    public class Day96 {
    public class KalkulatorPintar {
        static int tambah(int a, int b) {
            return a + b;
        }
        static int kurang(int a, int b) {
            return a - b;
        }
        static int kali(int a, int b) {
            return a * b;
        }
        static double bagi(int a, int b) {
            return (double) a / b;
        }
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.print("Masukkan Angka 1: ");
            int angka1 = tes.nextInt();
            System.out.print("Masukkan Angka 2: ");
            int angka2 = tes.nextInt();
            int hasilTambah = tambah(angka1, angka2);
            int hasilKurang = kurang(angka1, angka2);
            int hasilKali = kali(angka1, angka2);
            double hasilBagi = bagi(angka1, angka2);
            System.out.println("\n--- Hasil Operasi ---");
            System.out.println("Penjumlahan : " + hasilTambah);
            System.out.println("Pengurangan : " + hasilKurang);
            System.out.println("Perkalian   : " + hasilKali);
            System.out.println("Pembagian   : " + hasilBagi);
        }
    }}
