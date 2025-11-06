import java.util.Scanner;

public class searchNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key, hasil = 0;

        System.out.print("Masukkan banyaknya bilangan yang akan diinput: ");
        int jmlElm = sc.nextInt();
        int[] arrNilai = new int[jmlElm];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        sc.close();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+hasil);
        System.out.println();
    }
}
