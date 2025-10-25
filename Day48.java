import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.print(" Masukkan angka pertama: ");
        double pertama = tes.nextDouble();
        System.out.print(" Masukkan operator (+, -, *, /): ");
        char tanda = tes.next().charAt(0);
        System.out.print(" Masukkan angka kedua: ");
        double kedua = tes.nextDouble();
        double hasil;
        boolean valid = true;
        if (tanda == '/' && kedua == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            valid = false;
            hasil = 0;
        } else {
            switch (tanda) {
                case '+':
                    hasil = pertama + kedua;
                    break;
                case '-':
                    hasil = pertama - kedua;
                    break;
                case '*':
                    hasil = pertama * kedua;
                    break;
                case '/':
                    hasil = pertama / kedua;
                    break;
                default:
                    System.out.println( "Operator tidak dikenali. Gunakan +, -, *, atau /.");
                    valid = false;
                    hasil = 0;
            }
            if (valid) {
                boolean desimal = (pertama % 1 != 0) || (kedua % 1 != 0);
                if (desimal) {
                    System.out.println(" Hasil: " + hasil );
                } else if (hasil % 1 == 0) {
                    System.out.println(" Hasil: " + (int) hasil );
                } else {
                    System.out.println(" Hasil: " + hasil );
                }
            }
        }
    }
}
