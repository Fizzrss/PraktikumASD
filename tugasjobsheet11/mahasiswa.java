public class mahasiswa {
    String nim;
    String nama;
    String kelas;

    public mahasiswa(){
        
    }

    public mahasiswa(String nm, String name, String kls){
        nim = nm;
        nama = name;
        kelas = kls;
    }
    public void tampilInformasi(){
        System.out.println(nim + "\t\t" + nama + "\t" + kelas);
    }
}