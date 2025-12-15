import java.util.Scanner;
public class Day100 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        int n = tes.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = -1;
            x[i] = tes.nextInt();
        }
        int p = 0;
        for (int i = 0; i < n; i++) {
            int k = x[i] % n;

            while (y[k] != -1) {
                k = (k + 1) % n;
                p++;
            }
            y[k] = x[i];
        }
        int panjang = y[p % n];
        String sandi = "";
        int i = 0;
        while (sandi.length() < panjang) {
            sandi += y[i % n];
            i++;
        }
        System.out.println(sandi.substring(0, panjang));
    }
}
