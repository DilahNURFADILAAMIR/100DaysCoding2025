import java.util.Scanner;
public class Day30 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.print("Masukkan umur anak (tahun): ");
            int umur = tes.nextInt();
            boolean minimal = umur >= 1;
            boolean maksimal = umur <= 5;
            boolean balita = minimal & maksimal;

            System.out.println("Syarat minimal (umur >= 1): " + minimal);
            System.out.println("Syarat maksimal (umur <= 5): " + maksimal);
            System.out.println("Apakah umur " + umur + " tahun termasuk kategori BALITA? " + balita);
        }
}
