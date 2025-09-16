public class Day9 {

    public static void main(String[] args) {
        // Deklarasi & Inisialisasi
        String nama = "Belum ada data";
        int umur = 0;
        String jurusan = "Belum ada data";
        String universitas = "Belum ada data";

        // Cetak data awal
        System.out.println("=== Data Awal ===");
        System.out.println(nama + " | " + umur + " | " + jurusan + " | " + universitas);

        // Update
        nama = "Nurfadilah Amir";
        umur = 19;
        jurusan = "Informatika";
        universitas = "Universitas XYZ";

        // Cetak data setelah update
        System.out.println("\n=== Data Setelah Update ===");
        System.out.println(nama + " | " + umur + " | " + jurusan + " | " + universitas);
    }
}
