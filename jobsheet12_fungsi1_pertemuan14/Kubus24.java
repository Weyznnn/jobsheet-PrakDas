package jobsheet12_fungsi1_pertemuan14;

public class Kubus24 {

    public static long volumeKubus(int sisi) {
        long volume = sisi*sisi*sisi;
        return volume;
    }

    public static long luasPermukaanKubus(int sisi) {
        long luasPermukaan = sisi*sisi*6;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        System.out.println("Volume kubus adalah "+volumeKubus(3));
        System.out.println("Luas permukaan kubus adalah "+luasPermukaanKubus(5));
    }
}