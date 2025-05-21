
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

    public void add(String keyNim, Mahasiswa09 data) {
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
    
    public void print() {
        Node09 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Mahasiswa09 searchByNim(String nim) {
        Node09 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
}
