import java.util.Scanner;
public class Day46 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println(" === MENU WARUNG MIE === ");
            System.out.println(" 1. Mie Goreng ");
            System.out.println(" 2. Mie Kuah ");
            System.out.println(" 3. Mie Ayam ");
            System.out.println(" 4. Mie Pedas Level Up ");
            System.out.print(" Pilih menu (1-4): ");
            int pilihan = input.nextInt();
            String menu;
            switch (pilihan) {
                case 1:
                    menu = " Mie Goreng - Gurih dan nikmat ";
                    break;
                case 2:
                    menu = " Mie Kuah - Hangat dan segar ";
                    break;
                case 3:
                    menu = " Mie Ayam - Favorit sejuta umat ";
                    break;
                case 4:
                    menu = " Mie Pedas Level Up - Siap-siap kepedesan ";
                    break;
                default:
                    menu = " Menu tidak tersedia, silakan pilih 1-4 saja ";
            }
            System.out.println(" Anda memilih: " + menu );
        }
}
