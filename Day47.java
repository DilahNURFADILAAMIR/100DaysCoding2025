import java.util.Scanner;
public class Day47 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);

            System.out.print("Masukkan angka (1-7): ");
            int hari = tes.nextInt();

            String namaHari;
            String keterangan;

            switch (hari) {
                case 1:
                    namaHari = "Senin";
                    keterangan = "Hari Kerja";
                    break;
                case 2:
                    namaHari = "Selasa";
                    keterangan = "Hari Kerja";
                    break;
                case 3:
                    namaHari = "Rabu";
                    keterangan = "Hari Kerja";
                    break;
                case 4:
                    namaHari = "Kamis";
                    keterangan = "Hari Kerja";
                    break;
                case 5:
                    namaHari = "Jumat";
                    keterangan = "Hari Kerja";
                    break;
                case 6:
                    namaHari = "Sabtu";
                    keterangan = "Hari Libur";
                    break;
                case 7:
                    namaHari = "Minggu";
                    keterangan = "Hari Libur";
                    break;
                default:
                    namaHari = "Tidak diketahui";
                    keterangan = "Input tidak valid!";
                    break;
            }

            System.out.println("Hari ke-" + hari + " adalah " + namaHari + " - " + keterangan);
        }
}
