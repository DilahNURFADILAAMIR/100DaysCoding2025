import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Pemeriksaan Akses Ruang Server ===");
        System.out.print("Apakah Anda memiliki kartu akses (true/false): ");
        boolean kartuAkses = input.nextBoolean();
        if (kartuAkses) {
            System.out.print("Apakah Anda sedang dalam jadwal piket (true/false): ");
            boolean jadwalPiket = input.nextBoolean();

            if (jadwalPiket) {
                System.out.print("Masukkan kode pin: ");
                int kodePin = input.nextInt();

                if (kodePin == 1234) {
                    System.out.println("Akses diterima. Anda berhasil masuk ke ruang server utama.");
                } else {
                    System.out.println("Kode pin salah. Akses ditolak di tahap ruang server.");
                }

            } else {
                System.out.println("Anda tidak terdaftar dalam jadwal piket hari ini. Akses ditolak di tahap ruang IT.");
            }

        } else {
            System.out.println("Kartu akses tidak valid. Akses ditolak di gerbang utama.");
        }
    }
}
