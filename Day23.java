import java.util.Scanner;
public class Day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang (cm): ");
        double p = input.nextDouble();

        System.out.print("Masukkan lebar (cm): ");
        double l = input.nextDouble();

        System.out.println("Luas persegi panjang, dengan panjang " + p +
                " cm dan lebar " + l + " cm memiliki luas sebesar: " +
                (p * l) + " cm²");
    }
}
