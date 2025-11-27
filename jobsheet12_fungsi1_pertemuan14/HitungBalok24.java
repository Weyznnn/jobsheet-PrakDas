package jobsheet12_fungsi1_pertemuan14;

import java.util.Scanner;

public class HitungBalok24 {
    static int hitungLuas(int panjang, int lebar) {
        int Luas = panjang * lebar;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = sc.nextInt();

        System.out.println("Masukkan lebar");
        l = sc.nextInt();

        System.out.println("Masukkan tinggi");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("volume persegi panjang adalah " + vol);
        sc.close();
    }
}
