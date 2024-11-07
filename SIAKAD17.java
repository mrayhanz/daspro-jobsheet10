import java.util.Scanner;

public class SIAKAD17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang baris : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan panjang kolom : ");
        int kolom = sc.nextInt();
        int[][] nilai = new int[baris][kolom];

        for(int i = 0; i < nilai.length;i++){
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for(int j = 0; i < nilai[i].length;j++){
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai [i][j] = sc.nextInt();
                totalPerSiswa +=nilai [i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
        }
        
        System.out.println("\n======================================");
        System.out.println("Rata-rata Nilai setiap Mata kuliah : ");

        for(int j = 0;j < 3; ){
            double totalPerMatkul = 0;

            for(int i = 0;  i < 4; i++){
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul /4);
        }
    }
}
