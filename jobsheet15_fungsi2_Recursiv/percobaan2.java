package jobsheet15_fungsi2_Recursiv;

import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        
        System.out.print("Masukkan bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        pangkat = sc.nextInt();
        sc.close();
        
        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
