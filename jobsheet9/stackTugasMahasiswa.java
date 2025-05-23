public class stackTugasMahasiswa {
    mahasiswa09[] stack;
    int top;
    int size;

    public stackTugasMahasiswa(int size){
        this.size = size;
        stack = new mahasiswa09[size];
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
    public void push(mahasiswa09 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }
    public mahasiswa09 pop(){
        if (!isEmpty()) {
            mahasiswa09 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public mahasiswa09 peekAtas(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public mahasiswa09 peekBawah(){
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    public int jumlah(){
        int x = 0;
        for (int i = 0; i <= top; i++) {
            x++;
        }
        return x;
    }
    public String konversiDesimalKeBiner(int nilai){
        stackKonversi09 stack = new stackKonversi09();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai/2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}