package jobsheet12_fungsi1_pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe24 {
    public static void inputData(int[][] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Menu ke-"+(i+1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Masukkan penjualan hari ke-"+(j+1)+" : ");
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void outputData(int[][] array, int hariJual) {
        System.out.println("=======================================================================");
        System.out.println("------------------------- Penjualan Cafe ------------------------------");
        System.out.println("=======================================================================");
        System.out.print("\t\t");
        for (int i = 0; i < hariJual; i++) {
            System.out.print("Hari "+(i+1)+"\t");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print("Menu ke-"+(i+1)+"\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int[][] array) {
        int value = 0, hasil = 1;
        for (int i = 0; i < array.length; i++) {
            int total = 0;
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
            if (total > value) {
                value = total;
                hasil = (i+1);
            }
        }
        System.out.println("Menu "+(hasil)+" merupakan menu terjual tertinggi: "+(value));
    }
    
    public static void rataRataMenu(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            double total = 0;
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
            System.out.println("Rata - rata penjualan menu ke-"+(i+1)+" : "+total/array[i].length);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah hari penjualan");
        int hariJual = sc.nextInt();
        System.out.println("Masukkan jumlah menu");
        int jmlMenu = sc.nextInt();

        int penjualan[][] = new int[jmlMenu][hariJual];
        inputData(penjualan);
        outputData(penjualan, hariJual);
        System.out.println();
        menuTertinggi(penjualan);
        System.out.println();
        rataRataMenu(penjualan);
        sc.close();
    }
}
