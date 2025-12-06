import java.util.Scanner;
public class Day90 {
    static int maxx(int a, int b) {
        return (a > b) ? a : b;
    }
    static int minn(int a, int b) {
        return (a < b) ? a : b;
    }
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.print(" angka 1 : ");
        int x = tes.nextInt();
        System.out.print(" angka 2 : ");
        int y = tes.nextInt();
        int terbesar = maxx(x, y);
        int terkecil = minn(x, y);
        System.out.println("nilai terbesar : " + terbesar);
        System.out.println("nilai terkecil : " + terkecil);
    }
}
