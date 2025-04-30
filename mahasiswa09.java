public class mahasiswa09 {

    String nim;
    String nama;
    String kelas;
    int nilai;

    mahasiswa09(){

    }

    mahasiswa09(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}