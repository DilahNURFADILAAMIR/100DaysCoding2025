import java.util.Scanner;
public class Day32 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Apakah anda merupakan anggota premium? (true/false): ");
            boolean premium = input.nextBoolean();
            System.out.print("Apakah anda memiliki undangan khusus? (true/false): ");
            boolean undangan = input.nextBoolean();
            System.out.println("Hasil akses VIP: " + (premium || undangan));
        }
    }
