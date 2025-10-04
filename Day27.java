import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.println("Input :");
        int P = tes.nextInt();
        int L = tes.nextInt();

        int luas = P * L;

        int luasKeramik = 2 * 2;

        int jumlahKeramik = (luas + (luasKeramik - 1)) / luasKeramik;

        System.out.println("Output:");
        System.out.println(jumlahKeramik);
    }
}
