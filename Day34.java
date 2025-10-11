import java.util.Scanner;
public class Day34 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("=== Seleksi Kualifikasi Turnamen E-Sport ===");
            System.out.print("Input peringkat pemain: ");
            int peringkat = input.nextInt();
            System.out.print("Input jumlah pertandingan yang dimainkan: ");
            int jumlahMain = input.nextInt();
            System.out.print("Input rasio K/D pemain: ");
            double rasioKD = input.nextDouble();
            System.out.print("Apakah pemain baru? (true/false): ");
            boolean isPemainBaru = input.nextBoolean();
            System.out.print("Apakah memiliki Golden Ticket? (true/false): ");
            boolean punyaTiketEmas = input.nextBoolean();
            boolean syaratUtama = (peringkat >= 1000) && (jumlahMain % 10 != 0);
            boolean syaratBonus = ((rasioKD > 1.5 && !isPemainBaru) || punyaTiketEmas);
            boolean lolosKualifikasi = syaratUtama && syaratBonus;
            System.out.println("\nHasil akhir kualifikasi: " + lolosKualifikasi);
        }
    }
