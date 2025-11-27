package jobsheet12_fungsi1_pertemuan14;

public class PengunjungCafe24 {
    public static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");

        for (String nama : namaPengunjung) {
            System.out.println("- "+nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
