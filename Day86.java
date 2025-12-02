public class Day86 {
    public static void main(String[] args) {
        int[] nilai = {45, 70, 95, 30, 88, 65};
        System.out.println("--- Daftar Nilai Siswa ---");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("--------------------------");

        int min = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai Terendah di Kelas: " + min);
    }
}
