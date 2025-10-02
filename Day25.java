public class Day25 {
    public static void main(String[] args) {
        // Post-Increment
        int x = 5, y = x++;
        System.out.println("POST-INCREMENT: x = " + x + ", y = " + y);

        // Pre-Increment
        int a = 5, b = ++a;
        System.out.println("PRE-INCREMENT: a = " + a + ", b = " + b);

        // Analogi Kasir
        int harga = 10000;
        int transaksi1 = harga++;
        int transaksi2 = ++harga;
        System.out.println("Kasir -> Transaksi1: Rp " + transaksi1 +
                ", Transaksi2: Rp " + transaksi2);
    }
}
