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
            System.out.println("8. Masukkan data pada index tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data pada index tertentu");
            System.out.println("11. Tampil data di awal (head)");
            System.out.println("12. Tampil data di akhir (tail)");
            System.out.println("13. Tampil data di index tertentu");
            System.out.println("14. Tampil Jumlah data");
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
                case 8:
                    System.out.print("Masukkan index: ");
                    int ind = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa09 mhsI = inputMahasiswa(scan);
                    list.add(ind, mhsI);
                    break;
                case 9:
                    System.out.print("Masukkan NIM setelah data disisipkan: ");
                    String keynim = scan.nextLine();
                    list.removeAfter(keynim);
                    break;
                case 10:
                    System.out.print("Masukkan index: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    list.remove(idx);
                    break;
                case 11:
                    Mahasiswa09 awal = list.getFirst();
                    if (awal != null) {
                        System.out.println("Data yang berada di awal (head): ");
                        awal.tampil();   
                    } else {
                        System.out.println("List Kosong");
                    }
                    break;
                case 12:
                    Mahasiswa09 akhir = list.getLast();
                    if (akhir != null) {
                        System.out.println("Data yang berada di akhir (tail): ");
                        akhir.tampil();   
                    } else {
                        System.out.println("List Kosong");
                    }
                    break;
                case 13:
                    System.out.print("Masukkan index: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa09 mIndex = list.getIndex(index);
                    if (mIndex != null) {
                        System.out.println("Data yang berada di index " + index + ": ");
                        mIndex.tampil();   
                    } else {
                        System.out.println("Data pada index tersebut tidak ditemukan");
                    };
                    break;
                case 14:
                    System.out.println("Jumlah data Linked List: " + list.getSize());
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
