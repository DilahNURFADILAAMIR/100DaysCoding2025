import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        int M, N;
        long hasil = 1;
        System.out.println(" Masukkan angka baris (M): ");
         M = tes.nextInt();
        System.out.println(" Masukkan angka baris (N): ");
        N = tes.nextInt();
        for (int i = 1; i <=N ; i++) {
            hasil *=M;
        }
        System.out.println(" Hasil dari " +M+ "pangkat" +N+"adalah :" + hasil);
    }
}
