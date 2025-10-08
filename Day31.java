import java.util.Scanner;
    public class Day31 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan skor logika anda: ");
            int skorLogika = input.nextInt();
            System.out.print("Berapa tahun pengalaman coding anda: ");
            int tahunCoding = input.nextInt();
            boolean diterima = (skorLogika >= 80) && (tahunCoding > 2);
            System.out.println("Hasil seleksi keanggotaan: " + diterima);
        }
    }
