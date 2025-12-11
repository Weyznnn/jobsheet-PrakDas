package StudiKasus;

import java.util.Scanner;

public class StudiKasus2 {
    final static Scanner sc = new Scanner(System.in);
    static String dataMagang[][] = new String[0][6];
    static int jmlMagang = 0;
    final static String statusMagang[] = {"Diterima", "Menunggu", "Ditolak"};

    static String validasiStatusMagang() {
        boolean jenisNotValid = true;
        String statusMhs;
        do {
            System.out.print("Status magang (Diterima/Menunggu/Ditolak): ");
            statusMhs = sc.nextLine();
            for (int i = 0; i < statusMagang.length; i++) {
                if (statusMhs.equalsIgnoreCase(statusMagang[i])) {
                    jenisNotValid = false;
                    statusMagang[i] = statusMhs;
                    break;
                }
            }
            if (jenisNotValid) {
                System.out.println("Masukkan status magang yang valid!");
            }
        } while (jenisNotValid);
        return statusMhs;
    }

    static void tampilanMenu() {
        System.out.println("=== Sistem Pendaftaran Magang Mahasiswa ===");
        System.out.println("1. Tambah Data Magang");
        System.out.println("2. Tampilkan Semua Pendaftar Magang");
        System.out.println("3. Cari Pendaftar Berdasarkan Program Studi");
        System.out.println("4. Hitung Jumlah Pendaftar Untuk Setiap Status");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    static void tambahDataMhs() {
        String nama, nim, prodi, perusahaanMagang, statusMhs;
        int semester;
        
        System.out.print("Nama Mahasiswa: ");
        nama = sc.nextLine();
        
        System.out.print("NIM: ");
        nim = sc.nextLine();
        
        System.out.print("Program studi: ");
        prodi = sc.nextLine();

        System.out.print("Perusahaan tujuan magang: ");
        perusahaanMagang = sc.nextLine();

        do {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            semester = sc.nextInt();
            sc.nextLine();
        } while (semester < 6 || semester > 7);

        statusMhs = validasiStatusMagang();
        jmlMagang++;
        
        //Expand array size
        String[][] tempArray = new String[jmlMagang][6];
        for (int i = 0; i < dataMagang.length; i++) {
            tempArray[i] = dataMagang[i];
        }
        dataMagang = tempArray;
        
        dataMagang[jmlMagang-1][0] = nama;
        dataMagang[jmlMagang-1][1] = nim;
        dataMagang[jmlMagang-1][2] = prodi;
        dataMagang[jmlMagang-1][3] = perusahaanMagang;
        dataMagang[jmlMagang-1][4] = String.valueOf(semester);
        dataMagang[jmlMagang-1][5] = statusMhs;
        System.out.println("Data pendaftaran magang telah ditambahkan. Total pendaftar: "+jmlMagang);
    }

    static void tampilPendaftarMagang() {
        if (dataMagang.length == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        System.out.println("=== Pendaftar Magang ===");
        System.out.println("No\tNama\tNIM\tProdi\t\tPerusahaan\tSemester\tStatus");
        for (int i = 0; i < dataMagang.length; i++) {
            System.out.print((i+1)+".\t");
            for (int j = 0; j < dataMagang[i].length; j++) {
                System.out.print(dataMagang[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void cariPendaftarBerdasarkanProdi() {
        boolean tidakAda = true;
        System.out.print("Masukkan program studi: ");
        String prodiDiCari  = sc.nextLine();
        for (int i = 0; i < dataMagang.length; i++) {
            if (dataMagang[i][2].equalsIgnoreCase(prodiDiCari)) {
                tidakAda = false;
            }
        }
        if (tidakAda) {
            System.out.println("Tidak ada pendaftar magang pada prodi "+prodiDiCari+"!");
            return;
        }

        System.out.println("=== Data Pendaftar Dengan Prodi "+prodiDiCari+" ===");
        System.out.println("No\tNama\tNIM\tProdi\t\tPerusahaan\tSemester\tStatus");
        for (int i = 0; i < dataMagang.length; i++) {
            if (dataMagang[i][3].equalsIgnoreCase(prodiDiCari)) {
                for (int j = 0; j < dataMagang[i].length; j++) {
                    System.out.print(dataMagang[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }

    static void hitungBerdasarStatus() {
        for (int i = 0; i < statusMagang.length; i++) {
            int jumlah = 0;
            for (int j = 0; j < dataMagang.length; j++) {
                if (dataMagang[j][5].equals(statusMagang[i])) {
                    jumlah++;
                }
            }
            System.out.println(statusMagang[i]+": "+jumlah);
        }
    }

    public static void main(String[] args) {
        int menu;
        do {
            tampilanMenu();
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    tambahDataMhs();
                    System.out.println();
                    break;
                case 2:
                    tampilPendaftarMagang();
                    System.out.println();
                    break;
                case 3:
                    cariPendaftarBerdasarkanProdi();
                    System.out.println();
                    break;
                case 4:
                    hitungBerdasarStatus();
                    System.out.println();
                    break;
                default:
                    break;
            }
            
        } while (menu != 5);
    }
}
