import java.util.Scanner;

public class arrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMhs, mhsLulus = 0, mhsTidakLulus = 0;
        double totalLulus = 0, totalTidakLulus = 0, rata2Lulus, rata2TidakLulus;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();

        int nilaiMhs[] = new int[jmlMhs];
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                mhsLulus++;
            }
            else {
                totalTidakLulus += nilaiMhs[i];
                mhsTidakLulus++;
            }
        }

        rata2Lulus = totalLulus/mhsLulus;
        rata2TidakLulus = totalTidakLulus/mhsTidakLulus;

        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2TidakLulus);
    }
}
