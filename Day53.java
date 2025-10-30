import java.util.Scanner;
public class Day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan angka (1–3): ");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println(" Menu 1 dipilih ");
                break;
            case 2:
                System.out.println(" Menu 2 dipilih ");
                break;
            case 3:
                System.out.println(" Menu 3 dipilih ");
                break;
            default:
                System.out.println(" Pilihan tidak ada ");
        }
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println(" Angka 5 ditemukan, berhenti! ");
                break;
            }
            System.out.println(" Angka ke-" + i );
        }
        System.out.println(" Program selesai ");
    }
}
