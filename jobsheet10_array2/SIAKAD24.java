package jobsheet10_array2;

import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mahasiswa, matKul;

        System.out.print("Masukkan jumlah mahasiswa: ");
        mahasiswa = sc.nextInt();
        System.out.print("masukkan jumlah mata kuliah: ");
        matKul = sc.nextInt();
        System.out.println();

        int[][] nilai = new int[mahasiswa][matKul];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah "+(j+1)+": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: "+totalPerSiswa/matKul);
        }
        sc.close();

        System.out.println("\n=====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < matKul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < mahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul/mahasiswa);
        }
    }
}
