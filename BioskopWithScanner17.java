import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris,kolom;
        String nama,next;
        String [][] penonton = new String[4][2];

        while (true){
            System.out.println("Menu : ");
            System.out.println("1.Input data");
            System.out.println("2.Tampilkan daftar");
            System.out.println("3.Exit");
            System.out.print("Pilih Menu : ");
            int menu = sc.nextInt();
            sc.nextLine();
    
            if(menu == 1){
                while (true) {
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris atau kolom tidak valid. Coba lagi.");
                        continue;
                    }
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Tempat sudah terisi! Silakan pilih tempat lain.");
                    }
                    penonton[baris-1][kolom-1] = nama;
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
        
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
            else if(menu == 2){
                System.out.println("Daftar Penonton : ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                }
            }
            else if (menu == 3) {
                break;
            }
        }
    }
}
