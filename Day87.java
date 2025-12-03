import java.util.Scanner;
public class Day87 {
    public static void main(String[] args) {
        String[] buku = {"Harry Potter","Lord of the Rings","Alchemist","Sherlock Holmes","Hobbit"};
        Scanner s = new Scanner(System.in);
        System.out.println("--- Cari Buku ---");
        System.out.print("Masukkan judul buku: ");
        String j = s.nextLine();
        boolean ada = false;
        int p = -1;
        for(int i = 0; i < buku.length; i++);
            if(buku[i].equalsIgnoreCase(j)){
                ada = true;
                p = i;
                break;
            }
        }
        System.out.println("\nHasil:");
        if(ada){
            System.out.println("Buku '" + buku[p] + "' ditemukan di indeks ke-" + p + " (tumpukan ke-" + (p+1) + ").");
        } else {
            System.out.println("Maaf, buku tidak ada di tumpukan");
        }
    }
}
