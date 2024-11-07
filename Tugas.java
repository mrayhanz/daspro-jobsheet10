import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[10][6];
        double[]rataResp = new double[10];
        double[]rataPert = new double[6];
        int i,j;
        int rata2 = 0;

        System.out.println("Data Responden");
        System.out.println("=================");
        System.out.println("Masukkan angka 1-5");
        for(i = 0;i < data.length;i++){
            System.out.println("Responden ke -" + (i+1));
            for(j = 0;j < data[0].length;j++){
                System.out.print("Masukkan nilai pertanyaan ke " + (j+1) + " : ");
                data [i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < data.length; i++){
            for (j = 0; j < data[0].length; j++){
                rataResp[i] += data[i][j];
            }
            rataResp[i] /= data[0].length;
            System.out.println("Rata-rata responden ke-" + (i+1) + " : " + rataResp[i]);
        }
        for (i = 0; i < data[0].length; i++){
            for (j = 0; j < data.length; j++){
                rataPert[i] += data[j][i];
            }
            rataPert[i] /= data.length;
            System.out.println("Rata-rata pertanyaan ke-" + (i+1) + " : " + rataPert[i]);
        }
        for (i = 0; i < data.length; i++){
            for (j = 0; j < data[0].length; j++){
                rata2 += data[i][j];
            }
        }
        rata2 /= 60;
        System.out.println("Rata-rata semua : " + rata2);
    }
}
