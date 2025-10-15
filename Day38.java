import java.util.Scanner;
    public class Day38 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print(" Masukkan sebuah bilangan ");
            int angka = input.nextInt();
            if (angka > 0) {
                System.out.println(angka + " adalah bilangan POSITIF ");
            } else if (angka < 0) {
                System.out.println(angka + " adalah bilangan NEGATIF ");
            } else {
                System.out.println("Bilangan yang dimasukkan adalah NOL ");
            }
        }
    }


