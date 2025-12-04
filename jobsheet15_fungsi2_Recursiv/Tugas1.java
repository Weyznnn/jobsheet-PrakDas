package jobsheet15_fungsi2_Recursiv;

import java.util.Scanner;

public class Tugas1 {
    static void inputIterative(int n, int bilangan[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-"+(i)+": ");
            bilangan[i-1] = sc.nextInt();
        }
        sc.close();
    }
    
    static int sumBilanganRecursive(int n, int bilangan[]) {
        if (n == 0) {
            return 0;
        } else {
            return (bilangan[n-1] + sumBilanganRecursive(n - 1, bilangan));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang akan dihitung (N): ");
        int n = sc.nextInt();
        int bilangan[] = new int[n];

        inputIterative(n, bilangan);
        System.out.println("Total dari 4 angka yang dimasukkan adalah: "+sumBilanganRecursive(n, bilangan));
        sc.close();
    }
}
