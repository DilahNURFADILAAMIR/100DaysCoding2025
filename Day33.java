import java.util.Scanner;
public class Day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah teman-teman sudah siap (true/false) ? ");
        boolean siap = input.nextBoolean();
        System.out.print("Apakah kamu punya waktu sekarang (true/false) ? ");
        boolean luang = input.nextBoolean();
        boolean perbandingan = siap && luang;
        boolean keputusan = !perbandingan;
        System.out.println("\nApakah tidak bisa kumpul? " + keputusan);
        System.out.println("\n*note : true berarti tidak bisa, false berarti bisa");
    }
}
