import java.util.Date;

public class Day2 {
    public static void main(String[] args) {

        /* Contoh 1: Output dengan println() */
        System.out.println("==SOAL 1==");
        System.out.println("Saya akan bertahan selama 100 Hari Ngoding , dan akan menjadi anggota resmi ISC");
        System.out.println();

        /* Contoh 2: Output dengan print() */
        System.out.println("==SOAL 2==");
        System.out.print("Congratulations ");
        System.out.print("Telah menjadi anggota ISC 💙");
        System.out.println();
        System.out.println();

        /* Contoh 3: Output dengan printf() */
        System.out.println("==SOAL 3==");

        /* Data Mahasiswa */
        String nama = "Dila";
        String nim = "D0224040";
        String kelas = "D";
        int umur = 20;
        double tinggiBadan = 150.0;
        Date tanggalSekarang = new Date();

        /* Cetak biodata menggunakan printf */
        System.out.printf("| %-8s : %-15s |%n", "Nama", nama);
        System.out.printf("| %-8s : %-15s |%n", "NIM", nim);
        System.out.printf("| %-8s : %-15s |%n", "Kelas", kelas);
        System.out.printf("| %-8s : %-15d |%n", "Umur", umur);
        System.out.printf("| %-8s : %-15.2f |%n", "TB", tinggiBadan);
        System.out.printf("| %-8s : %-15tF |%n", "Tgl", tanggalSekarang);
    }
}
