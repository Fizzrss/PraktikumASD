public class queue {
    node front, rear;
    int size;
    int max;
    
    public queue(int max) {
        this.front = this.rear = null;
        this.size = 0;
        this.max = max;
    }
    
    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull(){
        return size >= max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(mahasiswa mhs) {
        node baru = new node(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public mahasiswa layanimahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        mahasiswa mhs = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println(mhs.nama + " sedang dilayani.");
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("mahasiswa terdepan:");
            front.data.tampilInformasi();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("mahasiswa terakhir:");
            rear.data.tampilInformasi();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar mahasiswa dalam Antrian:");
        System.out.println("NIM\t\tNAMA\tKELAS");
        node current = front;
        int no = 1;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}
