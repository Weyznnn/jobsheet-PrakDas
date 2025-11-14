package jobsheet10_array2;

import java.util.Scanner;

public class TugasSurvey24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        double totalKeseluruhan = 0;
        
        for (int i = 0; i < survey.length; i++) {
            double totalPerReponden = 0;
            System.out.println("Survey dari responden ke-"+(i+1));
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("Pertanyaan "+(i+1)+" (nilai 1-5): ");
                survey [i][j] = sc.nextInt();
                totalPerReponden += survey[i][j];
            }
            System.out.println("Rata-rata nilai survey dari responden ke-"+(i+1)+": "+totalPerReponden/6);
        }
        sc.close();
        
        System.out.println("\n================================");
        for (int i = 0; i < 6; i++) {
            double totalPerPertanyaan = 0;
            for (int j = 0; j < 10; j++) {
                totalPerPertanyaan += survey[j][i];
                totalKeseluruhan += survey[j][i];
            }
            System.out.println("Rata-rata nila survey pertanyaan ke-"+(i+1)+": "+totalPerPertanyaan/10);
        }
        System.out.println("Rata-rata dari keseluruhan survey: "+totalKeseluruhan/(10*6));
    }
}
