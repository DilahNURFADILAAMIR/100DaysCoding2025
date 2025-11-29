public class Day83 {
    public static void main(String[] args) {
        int[] pengeluaran = {20000, 50000, 30000, 15000, 10000, 40000, 100000};
        System.out.println("--- Rincian Pengeluaran ---");
        int total = 0;
        for (int i = 0; i < pengeluaran.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": Rp " + pengeluaran[i]);
            total += pengeluaran[i];
        }
        System.out.println("---------------------------");
        System.out.println("Total Pengeluaran Seminggu: Rp " + total);
    }
}
