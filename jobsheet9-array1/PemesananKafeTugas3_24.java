import java.util.Scanner;

public class PemesananKafeTugas3_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String menuDicari;
        boolean ada = false;

        System.out.print("Masukkan nama menu yang ingin dicari: ");
        menuDicari = sc.nextLine();
        sc.close();

        for (int i = 0; i < menu.length; i++) {
            if (menuDicari.equalsIgnoreCase(menu[i])) {
                ada = true;
            }
        }
        if (ada) {
            System.out.println("Menu yang dicari tersedia!");
        }
        else {
            System.out.println("Menu yang dicari tidak tersedia!");
        }
    }
}
