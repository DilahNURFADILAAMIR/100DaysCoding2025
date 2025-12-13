import java.util.Scanner;
public class Day97 {
    static int luasPersegi(int s) {
        return s * s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sisi: ");
        int s = sc.nextInt();
        System.out.println("Luas = " + luasPersegi(s));
    }
}
