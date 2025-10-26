import java.util.Scanner;
public class Day49 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println(" Penggunaan Operator Ternary ");
            System.out.print("Apakah hari ini hujan? (true/false): ");
            boolean hujan = input.nextBoolean();
            String aktivitas = (hujan) ? " Bawa payung ya " : "Cocok jalan-jalan nih ";
            System.out.println(" Saran aktivitas: " + aktivitas );
            System.out.print(" \nMasukkan total belanja kamu: ");
            int total = input.nextInt();
            int diskon = (total >= 100000) ? 20000 : 5000;
            System.out.println(" Kamu dapat diskon sebesar: Rp" + diskon );
            System.out.print(" \nMasukkan nilai ujian kamu: ");
            int nilai = input.nextInt();
            boolean lulus = (nilai >= 75) ? true : false;
            System.out.println(" Apakah kamu lulus? " + lulus );
            System.out.println(" \nProgram selesai dijalankan ");
        }
              }
