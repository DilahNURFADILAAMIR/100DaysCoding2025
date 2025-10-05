import java.util.Scanner;
public class Day28 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Masukkan angka pertama: ");
            int angka1 = input.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angka2 = input.nextInt();
            
            boolean hasilSama = (angka1 == angka2);
            
            boolean hasilTidakSama = (angka1 != angka2);
            
            System.out.println("Apakah " + angka1 + " sama dengan " + angka2 + "? " + hasilSama);
            System.out.println("Apakah " + angka1 + " tidak sama dengan " + angka2 + "? " + hasilTidakSama);
        }
}
