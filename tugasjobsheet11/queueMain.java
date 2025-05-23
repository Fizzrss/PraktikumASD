import java.util.Scanner;

public class queueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue q = new queue();
        
        int pilih;
        do {
            System.out.println("\n========== Menu Antrian Mahasiswa ==========");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Mengosongkan Antrian");
            System.out.println("3. Menambah Antrian");
            System.out.println("4. Melayani Antrian");
            System.out.println("5. Menampilkan Antrian Terdepan");
            System.out.println("6. Menampilkan Antrian Terakhir");
            System.out.println("7. Jumlah Dalam Antrian");
            System.out.println("8. Menampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Antrian " + (q.isEmpty()?  "kosong" : "Tidak kosong"));
                    break;
                case 2:
                    q.clear();
                    break;
                case 3:
                    mahasiswa mhs = inputMahasiswa(sc);
                    q.tambahAntrian(mhs);
                    break;
                case 4:
                    q.layanimahasiswa();
                    break;
                case 5:
                    q.lihatTerdepan();
                    break;
                case 6:
                    q.lihatAkhir();
                    break;
                case 7:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + q.getJumlahAntrian());
                    break;
                case 8:
                    q.tampilkanSemua();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih!=0);
    }

    static mahasiswa inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM\t: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama\t: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas\t: ");
        String kelas = sc.nextLine();
        return new mahasiswa(nim, nama, kelas);
    }
}
