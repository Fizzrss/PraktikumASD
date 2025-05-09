public class Mahasiswa {

    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public void tampilData(){
        System.out.printf("%-5s %-10s %-5s %-2s\n", nim, nama, prodi, kelas);
    }
}