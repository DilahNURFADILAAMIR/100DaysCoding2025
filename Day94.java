public class Day94{
    static void garisPembatas() {
        System.out.println("================================");
    }
    static void kotakNama(String nama) {
        System.out.println("|  Player : " + nama + "  |");
    }
    public static void main(String[] args) {
        garisPembatas();
        kotakNama(" dila ");
        garisPembatas();
        System.out.println(" menu: ");
        System.out.println("1. start game ");
        System.out.println("2. load game ");
        System.out.println("3. exit ");
        garisPembatas();
    }
}
