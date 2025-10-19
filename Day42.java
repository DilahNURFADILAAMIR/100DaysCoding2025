import java.util.Scanner;
    public class Day42 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.print(" Masukkan gaji kotor bulanan ");
            double gaji = tes.nextDouble();
            double pajak = 0;
            if (gaji > 0) {
                pajak = gaji * 0.05;
            }
            double gajiBersih = gaji - pajak;
            System.out.println("\n Rincian Gaji ");
            System.out.println("Gaji Kotor  : Rp " + gaji);
            System.out.println("Pajak (5%)  : Rp " + pajak);
            System.out.println("Gaji Bersih : Rp " + gajiBersih);

        }
    }
