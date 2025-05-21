import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList09 list = new DoubleLinkedList09();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Masukkan data setelah NIM tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa09 mhs1 = inputMahasiswa(scan);
                    list.addFirst(mhs1);
                    break;
                case 2:
                    Mahasiswa09 mhs2 = inputMahasiswa(scan);
                    list.addLast(mhs2);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node09 found = list.searchByNim(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan: ");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.print("Masukkan NIM setelah data disisipkan: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa09 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                    break;
                default:
                    break;
            }

        } while (pilihan != 0);
        scan.close();
    }

    static Mahasiswa09 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM\t: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama\t: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas\t: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK\t: ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa09(nim, nama, kelas, ipk);
    }
}
