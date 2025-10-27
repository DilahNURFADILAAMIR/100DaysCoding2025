import java.util.Scanner;
public class Day50 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.println(" Program Ganjil Genap dengan Operator Ternary ");
        System.out.print(" Masukkan sebuah angka: ");
        int angka = tes.nextInt();
        String hasil = (angka % 2 == 0) ? " Angka ini adalah Genap." : "Angka ini adalah Ganjil.";
        System.out.println(hasil);
    }
}
