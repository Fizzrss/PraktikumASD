import java.util.Scanner;

public class SLLMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkedlist sll = new singleLinkedlist();

        mahasiswa09 mhs1 = new mahasiswa09("24212200", "Alvaro", "1A", 4.0);
        mahasiswa09 mhs2 = new mahasiswa09("23212201", "Bimon", "2B", 3.8);
        mahasiswa09 mhs3 = new mahasiswa09("22212202", "Cintia", "3C", 3.5);
        mahasiswa09 mhs4 = new mahasiswa09("21212203", "Dirga", "4D", 3.6);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
    
    //     int pilih;
    //     do {
    //         System.out.println("========== Menu Linked List ==========");
    //         System.out.println("1. Tambah data di awal (addFirst)");
    //         System.out.println("2. Tambah data di akhir (addLast)");
    //         System.out.println("3. Tambah data setelah nama tertentu (insertAfter)");
    //         System.out.println("4. Tambah data di indeks tertentu (insertAt)");
    //         System.out.println("5. Tampilkan data");
    //         System.out.println("0. Keluar");
    //         System.out.print("Pilih menu: ");
    //         pilih = sc.nextInt();
    //         sc.nextLine();

    //         switch (pilih) {
    //             case 1:
    //                 mahasiswa09 m1 = inputMahasiswa(sc);
    //                 sll.addFirst(m1);
    //                 break;
    //             case 2:
    //                 mahasiswa09 m2 = inputMahasiswa(sc);
    //                 sll.addLast(m2);
    //                 break;
    //             case 3:
    //                 System.out.print("Masukkan nama setelah siapa akan disisipkan: ");
    //                 String key = sc.nextLine();
    //                 mahasiswa09 m3 = inputMahasiswa(sc);
    //                 sll.insertAfter(key, m3);
    //                 break;
    //             case 4:
    //                 System.out.print("Masukkan indeks: ");
    //                 int index = sc.nextInt();
    //                 sc.nextLine();
    //                 mahasiswa09 m4 = inputMahasiswa(sc);
    //                 sll.insertAt(index, m4);
    //                 break;
    //             case 5:
    //                 sll.print();
    //                 break;
    //             case 0:
    //                 System.out.println("Terima kasih!");
    //                 break;
    //             default:
    //                 System.out.println("Pilihan tidak valid.");
    //         }
    //     } while (pilih != 0);
    //     sc.close();
    // }
    
    // static mahasiswa09 inputMahasiswa(Scanner sc) {
    //     System.out.print("Masukkan NIM: ");
    //     String nim = sc.nextLine();
    //     System.out.print("Masukkan Nama: ");
    //     String nama = sc.nextLine();
    //     System.out.print("Masukkan Kelas: ");
    //     String kelas = sc.nextLine();
    //     System.out.print("Masukkan IPK: ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine(); 
    //     return new mahasiswa09(nim, nama, kelas, ipk);
    // }