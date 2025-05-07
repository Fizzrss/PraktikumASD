public class Antrian {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDilayani;
    int maxDilayani = 30;
    
    public Antrian(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDilayani = 0;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }    
    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void tambahAntrian(Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah siswa! Maksimal 10 mahasiswa");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }
    public void layaniDuaMahasiswa(){
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dilayani");
            return;
        } 
        if (totalDilayani >= maxDilayani) {
            System.out.println("kuota DPA sudah penuh (30 mahasiswa)");
            return;
        }
        System.out.println("Melayani 2 Mahasiswa Terdepan: ");
        int bisaDilayani = 2;
        if (size < 2) {
            bisaDilayani = size;
        }
        if ((maxDilayani - totalDilayani) < bisaDilayani) {
            bisaDilayani = maxDilayani - totalDilayani;
        }
        for (int i = 0; i < bisaDilayani; i++) {
            Mahasiswa mhs = data[front];
            System.out.print((1+i) + ". ");
            mhs.tampilData();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
        if (bisaDilayani < 2) {
            System.out.println("Hanya bisa melayani " + bisaDilayani + " mahasiswa");
        }
    }
    public void lihatDuaTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } else {
            System.out.println("Mahasiswa 2 terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < 2 && i < size; i++) {
                int index = (front + i) % max;
                data[index].tampilData();
            }
        }
    }
    public void lihatAkhir(){
        if (isEmpty()) {
            System.out.println("Antrian kososng.");
            return;
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilData();
        }
    }
    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilData();
        }
    }
    public int getJumlahAntrian(){
        if (size < 0) {
            return 0;
        }
        return size;
    }
    public int getSudahDilayani(){
        return totalDilayani;
    }
    public int getBelumDilayani(){
        int sisa = maxDilayani - totalDilayani;

        if (sisa < 0) {
            return 0;
        } else {
            return sisa;
        }
    }
}
