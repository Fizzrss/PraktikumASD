public class antrianLayanan {
    mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public antrianLayanan(int max){
        this.max = max;
        this.data = new mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
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
    public void lihatTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian kososng.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilData();
        }
    }
    public void lihatAkhir(){
        if (isEmpty()) {
            System.out.println("Antrian kososng.");
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
    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void tambahAntrian(mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah siswa");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }
    public mahasiswa layaniMahasiswa(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } 
        mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public int getJumlahAntrian(){
        return size;
    }
}