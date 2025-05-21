import java.util.Scanner;

public class queueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Maksimal data yang ingin masukkan: ");
        int data = sc.nextInt();
        queue q = new queue(data);
        
        int pilih;
        do {
            System.out.println("\n========== Menu Antrian Mahasiswa ==========");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Mengosongkan Antrian");
            System.out.println("4. Menambah Antrian");
            System.out.println("5. Melayani Antrian");
            System.out.println("6. Menampilkan Antrian Terdepan");
            System.out.println("7. Menampilkan Antrian Terakhir");
            System.out.println("8. Jumlah Dalam Antrian");
            System.out.println("9. Menampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Antrian " + (q.isEmpty()?  "kosong" : "Tidak kosong"));
                    break;
                case 2:
                    System.out.println("Antrian " + (q.isFull()?  "penuh" : "Tidak penuh"));
                    break;
                case 3:
                    System.out.println("Mengosongkan Antrian");
                    q.clear();
                    break;
                case 4:
                    mahasiswa mhs = inputMahasiswa(sc);
                    q.tambahAntrian(mhs);
                    break;
                case 5:
                    q.layanimahasiswa();
                    break;
                case 6:
                    q.lihatTerdepan();
                    break;
                case 7:
                    q.lihatAkhir();
                    break;
                case 8:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + q.getJumlahAntrian());
                    break;
                case 9:
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
        sc.nextLine();
        System.out.print("Masukkan Nama\t: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas\t: ");
        String kelas = sc.nextLine();
        return new mahasiswa(nim, nama, kelas);
    }
}
