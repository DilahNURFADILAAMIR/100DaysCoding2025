import java.util.Scanner;
public class Day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan batas perkalian: ");
        int batas = input.nextInt();
        System.out.print(" Masukkan angka: ");
        int angka = input.nextInt();
        for (int i = 1; i <= batas; i++) {
            System.out.println(i + " x " + angka + " = " + (i * angka));
        }
    }
}
