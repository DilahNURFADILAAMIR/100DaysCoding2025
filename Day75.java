import java.util.Scanner;
public class Day75 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.print(" Masukkan warna favoritt : ");
        String warna = tes.nextLine();

        System.out.println(" panjang karakter : " +warna.length());
        System.out.println(" Huruf Besar :" +warna.toUpperCase());
        System.out.println(" Huruf Kecil :"+warna.toLowerCase());
        System.out.println(" Kalimat warna asli :" +warna);
    }
}
