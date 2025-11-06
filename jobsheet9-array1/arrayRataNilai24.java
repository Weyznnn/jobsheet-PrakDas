import java.util.Scanner;

public class arrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiMhs[] = new int[10];
        int mhsLulus = 0;
        double total = 0, rata2;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] >70) {
                mhsLulus++;
            }
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Banyak mahasiswa yang lulus = "+mhsLulus);
        System.out.println("Rata-rata nilai = "+rata2);
    }
}
