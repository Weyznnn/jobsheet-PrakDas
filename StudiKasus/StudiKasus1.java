package StudiKasus;

import java.util.Scanner;

public class StudiKasus1 {
    static Scanner sc = new Scanner(System.in);
    static int jmlPendaftar = 0;
    static String[][] dataPendaftar = new String[0][5];
    static String jenisBeasiswa[] = {"Reguler", "Unggulan", "Riset"};
    
    static String validasiJenisBeasiswa() {
        boolean jenisNotValid = true;
        String jenisBeasiswaPilihan;
        do {
            System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
            jenisBeasiswaPilihan = sc.nextLine();
            for (int i = 0; i < jenisBeasiswa.length; i++) {
                if (jenisBeasiswaPilihan.equalsIgnoreCase(jenisBeasiswa[i])) {
                    jenisNotValid = false;
                    jenisBeasiswa[i] = jenisBeasiswaPilihan;
                    break;
                }
            }
            if (jenisNotValid) {
                System.out.println("Masukkan jenis beasiswa yang terdaftar!");
            }
        } while (jenisNotValid);
        return jenisBeasiswaPilihan;
    }
    
    static void tampilanMenu() {
        System.out.println("=== Sistem Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Tampilkan Pendaftar Berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata - rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }
    
    static void tambahDataMhs() {
        String nama, nim;
        double IPKTerakhir, pendapatanOrtu, maxPendapatanOrtu = 2000000;
        
        System.out.print("Nama Mahasiswa: ");
        nama = sc.nextLine();
        
        System.out.print("NIM: ");
        nim = sc.nextLine();
        
        do {
            System.out.print("IPK terakhir: ");
            IPKTerakhir = sc.nextDouble();
            sc.nextLine();
        } while (IPKTerakhir > 4.0 || IPKTerakhir < 0);
        
        System.out.print("Penghasilan orang tua (maksimal 2000000): ");
        pendapatanOrtu = sc.nextDouble();
        sc.nextLine();
        if (pendapatanOrtu > maxPendapatanOrtu) {
            System.out.println("Pendaftaran dibatalkan karena penghasilan melebihi batas maksimal.");
            return;
        }
        
        String[][] tempArray = new String[jmlPendaftar][5];
        for (int i = 0; i < dataPendaftar.length; i++) {
            tempArray[i] = dataPendaftar[i];
        }
        dataPendaftar = tempArray;
        
        // Index 0 = Nama, 1 = NIM, 2 = IPK, 3 = Jenis Beasiswa, 4 = Pendapatan orang tua
        dataPendaftar[jmlPendaftar-1][0] = nama;
        dataPendaftar[jmlPendaftar-1][1] = nim;
        dataPendaftar[jmlPendaftar-1][2] = String.valueOf(IPKTerakhir);
        dataPendaftar[jmlPendaftar-1][3] = validasiJenisBeasiswa();
        dataPendaftar[jmlPendaftar-1][4] = String.valueOf(pendapatanOrtu);
        System.out.println("Pendaftar berhasil disimpan. Total pendaftar: "+jmlPendaftar);
    }

    static void tampilPendaftar() {
        System.out.println("=== Pendaftar Beasiswa ===");
        System.out.println("No\tNama\tNIM\tIPK\tJenis\tPenghasilan Orang Tua");
        for (int i = 0; i < dataPendaftar.length; i++) {
            System.out.print((i+1)+".\t");
            for (int j = 0; j < dataPendaftar[i].length; j++) {
                System.out.print(dataPendaftar[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void cariPendaftarBerdasarkanJenis() {
        boolean tidakAda = true;
        String jenisDicari = validasiJenisBeasiswa();
        System.out.println("=== Jenis Beasiswa "+jenisDicari+" ===");
        System.out.println("Nama\tNIM\tIPK\tJenis\tPenghasilan Orang Tua");
        for (int i = 0; i < dataPendaftar.length; i++) {
            if (dataPendaftar[i][3].equals(jenisDicari)) {
                tidakAda = false;
                for (int j = 0; j < dataPendaftar[i].length; j++) {
                    System.out.print(dataPendaftar[i][j]+"\t");
                }
                System.out.println();
            }
        }
        if (tidakAda) {
            System.out.println("Tidak ada pendaftar pada jenis beasiswa "+jenisDicari+"!");
        }
    }

    static void hitungRata2IPK() {
        for (int i = 0; i < jenisBeasiswa.length; i++) {
            double jumlah = 0;
            int count = 0;
            for (int j = 0; j < dataPendaftar.length; j++) {
                if (dataPendaftar[j][3].equals(jenisBeasiswa[i])) {
                    jumlah += Double.parseDouble(dataPendaftar[j][2]);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(jenisBeasiswa[i]+": Tidak ada pendaftar.");
            } else {
                System.out.println(jenisBeasiswa[i]+": rata - rata IPK = "+(jumlah/count));
            }
        }
    }

    public static void main(String[] args) {
        int menu;
        
        do {
            tampilanMenu();
            menu = sc.nextInt();
            sc.nextLine();
            if (menu < 1 || menu > 5) {
                System.out.println("Masukkan nilai menu yanng valid!");
                continue;
            }
            switch (menu) {
                case 1:
                    jmlPendaftar++;
                    tambahDataMhs();
                    System.out.println();
                    break;
                case 2:
                    if (jmlPendaftar == 0) {
                        System.out.println("Belum ada pendaftar.");
                        System.out.println();
                        break;
                    }
                    tampilPendaftar();
                    System.out.println();
                    break;
                case 3:
                    cariPendaftarBerdasarkanJenis();
                    System.out.println();
                    break;
                case 4:
                    hitungRata2IPK();
                    System.out.println();
                    break;
                default:
                    break;
            }
        } while (menu != 5);
    }
}
