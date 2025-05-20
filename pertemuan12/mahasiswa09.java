public class mahasiswa09 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa09(){
        
    }

    public mahasiswa09(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    public void tampilInformasi(){
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}