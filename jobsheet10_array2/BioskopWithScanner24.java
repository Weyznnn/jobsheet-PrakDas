package jobsheet10_array2;

import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int baris, kolom;
        String nama;
        boolean keluar = false;

        while (!keluar) {
            int next = 0;
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Pilih menu (angka): ");
            next = sc.nextInt();
            sc.nextLine();

            switch (next) {
                case 1:
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                
                if (baris > 4 || baris < 1 || kolom < 1 || kolom > 2) {
                    System.out.println("Kursi pada baris atau kolom tersebut tidak tersedia");
                    break;
                }
    
                penonton[baris-1][kolom-1] = nama;
                    break;
                case 2:
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke-"+(i+1)+": "+String.join(", ", penonton[i]));
                };
                    break;
                case 3:
                    keluar = true;
                    break;
                default:
                    System.out.println("Masukkan menu yang valid!");
                    break;
            }
        }
        sc.close();
    }
}
