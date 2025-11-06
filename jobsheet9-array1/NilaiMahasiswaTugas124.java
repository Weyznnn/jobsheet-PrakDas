import java.util.Scanner;

public class NilaiMahasiswaTugas124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int nilaiMahasiswa[] = new int[jmlMhs];
        int nilaiTertinggi = 0, nilaiTerendah = 100;
        double totalNilai = 0, rata2Nilai;
        
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMahasiswa[i] = sc.nextInt();

            totalNilai += nilaiMahasiswa[i];

            if (nilaiTerendah > nilaiMahasiswa[i]) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
            if (nilaiTertinggi < nilaiMahasiswa[i]) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
        }
        sc.close();
        rata2Nilai = totalNilai/nilaiMahasiswa.length;
        
        System.out.println();
        System.out.println(" ---Nilai Mahasiswa--- ");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" = "+nilaiMahasiswa[i]);
        }
        System.out.println("\nNilai mahasiswa tertinggi = "+nilaiTertinggi);
        System.out.println("Nilai mahasiswa terendah  = "+nilaiTerendah+"\n");
        System.out.printf("Rata-rata nilai mahasiswa = %.2f",rata2Nilai);
    }
}
