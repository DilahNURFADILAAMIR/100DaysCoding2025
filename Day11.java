import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Form Pendaftaran Mahasiswa");

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Umur: ");
        byte umur = input.nextByte();

        System.out.print("Masukkan Tahun Lahir: ");
        short tahunLahir = input.nextShort();

        input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine(); // ubah jadi String

        System.out.print("Masukkan Nomor Telepon: ");
        long nomorTelepon = input.nextLong();

        System.out.print("Masukkan IPK: ");
        float ipk = input.nextFloat();

        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();

        System.out.print("Apakah masih aktif (true/false): ");
        boolean isAktif = input.nextBoolean();

        System.out.print("Masukkan minimal 3 huruf (contoh: ABCDE): ");
        char hurufKetiga = input.next().charAt(2);

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama Lengkap   : " + namaLengkap);
        System.out.println("Umur           : " + umur);
        System.out.println("Tahun Lahir    : " + tahunLahir);
        System.out.println("NIM            : " + nim); // tetap tampil D0224040
        System.out.println("Nomor Telepon  : " + nomorTelepon);
        System.out.println("IPK            : " + ipk);
        System.out.println("Berat Badan    : " + beratBadan );
        System.out.println("Status Aktif   : " + isAktif);
        System.out.println("Golongan Darah (huruf ke-3): " + hurufKetiga);

        input.close();
    }
}
