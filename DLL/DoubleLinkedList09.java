
public class DoubleLinkedList09 {
    Node09 head;
    Node09 tail;

    public DoubleLinkedList09() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa09 data) {
        Node09 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node09 newNode = new Node09(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa09 dataterhapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah ");
        dataterhapus.tampil();
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa09 dataterhapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah ");
        dataterhapus.tampil();
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list kosong!");
        } else {
            Node09 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public Node09 searchByNim(String nim) {
        Node09 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(int index, Mahasiswa09 data){
        if (index < 0) {
            System.out.println("Index tidak ditemukan");
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node09 current = head;
            int i = 0;
            while (current != null && i < index - 1) {
                current = current.next;
                i++;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah elemen");
            } else if (current.next == null) {
                addLast(data);
            } else {
                Node09 newNode = new Node09(data);
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
            }
        }
    }

    public void removeAfter(String keyNim){
        Node09 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("List Kosong. Tidak ada data yang dapat dihapus");
            return;
        }

        Node09 hapus = current.next;
        current.next = hapus.next;

        if (hapus.next != null) {
            hapus.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus");
        hapus.data.tampil();
    }

    public void remove(int index){
        if (isEmpty()) {
            System.out.println("List Kosong");
            return;
        }
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }

        Node09 current = head;
        int indCurrent = 0;

        while (current != null && indCurrent < index) {
            current = current.next;
            indCurrent++;
        }
        if (current == null) {
            System.out.println("Index melebihi data");
        } else {
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                System.out.println("Data pada index " + index + " berhasil dihapus:");
                current.data.tampil();
            }
        }
    }
}
