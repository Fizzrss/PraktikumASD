public class queue {
    node front, rear;
    int size;
    
    public queue() {
        this.front = this.rear = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return front == null;
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Tidak dapat mengosongkan antrian. Antrian masih kosong");
        } else {
            front = rear = null;
            size = 0;
            System.out.println("Mengosongkan Antrian");
            System.out.println("Antrian dikosongkan.");
        }
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
            System.out.println("NIM\t\tNAMA\tKELAS");
            front.data.tampilInformasi();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("mahasiswa terakhir:");
            System.out.println("NIM\t\tNAMA\tKELAS");
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
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}
