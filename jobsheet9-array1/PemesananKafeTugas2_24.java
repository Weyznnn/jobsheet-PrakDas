import java.util.Scanner;

public class PemesananKafeTugas2_24 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Masukkan jumlah menu yang akan dipesan: ");
        int jmlPesanan = sc.nextInt();
        
        
        String namaPesanan[] = new String[jmlPesanan];
        double harga[] = new double[jmlPesanan];
        double total = 0;
        
        for (int i = 0; i < namaPesanan.length; i++) {
            sc.nextLine();
            System.out.print("Masukkan nama menu "+(i+1)+": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga dari menu"+(i+1)+": Rp. ");
            harga[i] = sc.nextDouble();

            total += harga[i];
        }
        sc.close();

        System.out.println("\n ---Check Pesanan--- ");
        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.println("Menu "+(i+1)+" yang dipesan: "+namaPesanan[i]);
        }
        System.out.println("Total harga pesanan adalah Rp. "+total);
    }
}
