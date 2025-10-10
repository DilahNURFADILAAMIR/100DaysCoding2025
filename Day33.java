import java.util.Scanner;
public class Day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Apakah teman-teman sudah siap? (true/false): ");
        boolean temanSiap = input.nextBoolean();
        System.out.print(" Apakah kamu punya waktu sekarang? (true/false): ");
        boolean kamuSiap = input.nextBoolean();
        if (!temanSiap || !kamuSiap) {
            System.out.println(" Hmm, belum bisa ngumpul sekarang. Coba lain waktu ");
        } else {
            System.out.println(" Yeay! Saatnya ngumpul sama teman-teman wkwkw ");
        }
    }
}
