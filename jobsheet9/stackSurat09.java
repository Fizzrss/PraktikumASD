public class stackSurat09 {
    surat09[] surat;
    int top;
    int size;

    public stackSurat09(int size){
        this.size = size;
        surat = new surat09[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(surat09 srt){
        if (!isFull()) {
            top++;
            surat[top] = srt;
        } else {
            System.out.println("stack penuh! Tidak bisa menambahkan surat lagi");
        }
    }
    public surat09 pop(){
        if (!isEmpty()) {
            surat09 s = surat[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dinilai.");
            return null;
        }
    }
    public surat09 peek(){
        if (!isEmpty()) {
            return surat[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (surat != null && surat[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.print("Surat ditemukan: \n");
                surat[i].tampilkan();
                ditemukan = true;
                System.out.print("Surat ditemukan karena belum diproses");
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan karena sudah diproses.");
        }

    }

}
