import java.util.Scanner;
    public class Day24 {
        public static void main(String[] args) {

            final double PI = 3.14;
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jari-jari lingkaran (cm): ");
            double r = input.nextDouble();
            double luas = PI * r * r;


            System.out.println("Luas lingkaran dengan jari-jari " + r + " cm adalah: " + luas + " cm²");
        }
    }
