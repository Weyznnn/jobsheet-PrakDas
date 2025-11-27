package jobsheet12_fungsi1_pertemuan14;

public class kafe24 {
    public static void Menu(String namaPelangan, boolean isMember) {
        System.out.println("Selamat datang, "+namaPelangan+"!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,0000");
        System.out.println("4. Roti Goreng - Rp 10,000");
        System.out.println("5. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    public static void main(String[] args) {
        Menu("Andi", true);
    }
}
