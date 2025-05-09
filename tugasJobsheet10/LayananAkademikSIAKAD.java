import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian antrian = new Antrian(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS Kepada DPA ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tambahkan Antrian Mahasiswa");
            System.out.println("5. Melayani 2 Mahasiswa"); 
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Tampilkan 2 Antrian Terdepan");
            System.out.println("8. Tampilkan Antrian Terakhir");
            System.out.println("9. Jumlah KRS Mahasiswa dalam Antrian");
            System.out.println("10. Jumlah KRS Mahasiswa yang sudah diproses");
            System.out.println("11. Sisa Kuota Proses oleh DPA");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Antrian " + (antrian.isEmpty()? "kosong" : "Tidak kosong"));
                    break;

                case 2:
                    System.out.println("Antrian " + (antrian.isFull()? "penuh" : "Tidak penuh"));
                    break;

                case 3:
                    System.out.println("Mengosongkan Antrian");
                    antrian.clear();
                    break;
                case 4:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                
                case 5:
                    antrian.layaniDuaMahasiswa();
                    break;

                case 6:
                    antrian.tampilkanSemua();
                    break;

                case 7:
                    antrian.lihatDuaTerdepan();
                    break;
                
                case 8:
                    antrian.lihatAkhir();
                    break;

                case 9:
                    System.out.println("Jumlah Antrian: " + antrian.getJumlahAntrian());
                    break;
                    
                case 10:
                    System.out.println("Jumlah yang Sudah dilayani: " + antrian.getSudahDilayani());
                    break;
                    
                case 11:
                    System.out.println("Jumlah yang belum dilayani: " + antrian.getBelumDilayani());
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
