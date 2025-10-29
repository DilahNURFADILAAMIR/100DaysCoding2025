import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        int rahasia = 3;
        int tebakan = -1;
        System.out.println("  Program Tebak Angka ");
        while (tebakan != rahasia) {
            System.out.print(" Masukkan tebakan kamu (1-10): ");
            tebakan =tes.nextInt();
        }
        System.out.println(" Yeay! Kamu berhasil menebak dengan benar! ");
    }
}
