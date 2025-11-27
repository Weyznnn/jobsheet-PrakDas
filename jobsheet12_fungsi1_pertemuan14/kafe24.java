package jobsheet12_fungsi1_pertemuan14;

import java.util.Scanner;

public class kafe24 {
    public static void Menu(String namaPelangan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, "+namaPelangan+"!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 30%!");
        } else {
            System.out.println("Kode promo invalid!");
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

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] *banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Budi", true, "DISKON30");
        System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah menu yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan anda: "+totalHarga);
        sc.close();
    }
}
