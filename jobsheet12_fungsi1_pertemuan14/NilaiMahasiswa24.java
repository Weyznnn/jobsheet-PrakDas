package jobsheet12_fungsi1_pertemuan14;

import java.util.Scanner;

public class NilaiMahasiswa24 {
    public static void isianArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void tampilArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+": "+array[i]);
        }
    }

    public static int hitTot(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int nilaiMahasiswa[] = new int[jumlahMhs];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);
        System.out.println("Nilai total mahasiswa: "+hitTot(nilaiMahasiswa));
        sc.close();
    }
}