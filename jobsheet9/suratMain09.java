import java.util.Scanner;

public class suratMain09 {
    public static void main(String[] args) {
        stackSurat09 surat = new stackSurat09(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== Pilih Menu ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan nama mahasiwa");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            
            switch (pilih) {
                case 1:
                System.out.println("\n=== Masukkan data surat ===");
                System.out.print("Id surat\t: ");
                String idSurat = scan.nextLine();
                System.out.print("Nama Mahasiswa\t: ");
                String nama = scan.nextLine();
                System.out.print("Kelas\t\t: ");
                String kelas = scan.nextLine();
                System.out.print("Jenis Izin (I/S): ");
                char jenisIzin = scan.nextLine().toUpperCase().charAt(0);
                System.out.print("Durasi Izin (hari): ");
                String durasi = scan.nextLine();
    
                surat09 srt = new surat09(idSurat, nama, kelas, jenisIzin, Integer.parseInt(durasi));
                surat.push(srt);
                System.out.printf("Surat %s berhasil dimasukkan\n", srt.namaMahasiswa);
                break;
            
            case 2:
            System.out.println("\n=== Proses Surat Izin ===");
                surat09 proses = surat.pop();
                if (proses != null) {
                    System.out.println("Surat berikut sedang diproses");
                    proses.tampilkan();
                }
                break;

            case 3:
                System.out.println("\n=== Surat Terakhir ===");
                surat09 lihat = surat.peek();
                if (lihat != null) {
                    System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                }
                break;

            case 4:
            System.out.println("\n=== Mencari data surat ===");
                System.out.print("Masukkan nama mahasiswa: ");
                String namaCari = scan.nextLine();
                surat.cariSurat(namaCari);
                break;
            
            default:
                System.out.println("Pilihan tidak valid");
                break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
