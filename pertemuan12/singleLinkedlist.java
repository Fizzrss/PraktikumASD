public class singleLinkedlist {
    nodeMahasiswa09 head;
    nodeMahasiswa09 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            nodeMahasiswa09 tmp = head;
            System.out.print("Isi Linked List:\n");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    public void addFirst(mahasiswa09 input) {
        nodeMahasiswa09 ndInput = new nodeMahasiswa09(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(mahasiswa09 input) {
        nodeMahasiswa09 ndInput = new nodeMahasiswa09(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, mahasiswa09 input) {
        nodeMahasiswa09 ndInput = new nodeMahasiswa09(input, null);
        nodeMahasiswa09 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, mahasiswa09 input) {
        if (index < 0) {
            System.out.println("Indeks salah!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            nodeMahasiswa09 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new nodeMahasiswa09(input, temp.next);
            if (temp.next.next == null)
                tail = temp.next;
        }
    }
}
