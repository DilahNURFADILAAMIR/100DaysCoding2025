import java.util.Scanner;
public class Day69 {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int total = 0;
                int pilih;
                do {
                    System.out.println("1. Nasi Goreng    (15000)");
                    System.out.println("2. Mie Ayam     (12000)");
                    System.out.println("3. Bakso        (10000)");
                    System.out.println("4. Es Teh       (5000)");
                    System.out.println("0. Selesai & Bayar");
                    System.out.print("Pilih: ");
                    pilih = in.nextInt();
                    switch (pilih) {
                        case 1:
                            total += 15000;
                            break;
                        case 2:
                            total += 12000;
                            break;
                        case 3:
                            total += 10000;
                            break;
                        case 4:
                            total += 5000;
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                    }
                    System.out.println(" Total sementara: " + total + "\n ");
                } while (pilih != 0);

                System.out.println(" Total Belanja: " + total );
                System.out.print(" Uang bayar: ");
                int bayar = in.nextInt();
                while (bayar < total) {
                    System.out.println(" Uang kurang! ");
                    System.out.print(" Masukkan lagi: ");
                    bayar = in.nextInt();
                }
                int kembalian = bayar - total;
                System.out.println(" \n Struk ");
                System.out.println(" Total : " + total);
                System.out.println(" Bayar : " + bayar);
                System.out.println(" Kembalian : " + kembalian);
                System.out.println(" Terima kasih!");
            }
        }
