import java.util.Scanner;
public class Day74 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        int pilih;
        int total = 0;
        do {
            System.out.println("\n Menu ");
            System.out.println("1. Nasi Kuning   Rp 10000");
            System.out.println("2. Es Teh Panas  Rp 5000");
            System.out.println("3. Kopi Susu     Rp 5000");
            System.out.println("4. Bakso Kuah    Rp 10000");
            System.out.println("5. Selesaikan Pembayaran");
            System.out.print("Pilih menu: ");
            pilih = tes.nextInt();
            switch (pilih) {
                case 1:
                    total += 10000;
                    break;
                case 2:
                    total += 5000;
                    break;
                case 3:
                    total += 5000;
                    break;
                case 4:
                    total += 10000;
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
            }
        } while (pilih != 5);
        System.out.println("\nTotal belanja : Rp " + total);
    }
}
