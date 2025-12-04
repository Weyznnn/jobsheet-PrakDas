package jobsheet15_fungsi2_Recursiv;

public class percobaan1 {

    static int factorialRecursiv(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorialRecursiv(n - 1));
        }
    }
    
    static int factorialIterative(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(factorialRecursiv(5));
        System.out.println(factorialIterative(5));
    }
}