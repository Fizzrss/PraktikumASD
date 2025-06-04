public class binaryTree09 {
    node09 root;

    public binaryTree09(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(mahasiswa09 mahasiswa){
        node09 newNode = new node09(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            node09 current = root;
            node09 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk){
        boolean result = false;
        node09 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void tranversePreOrder(node09 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            tranversePreOrder(node.left);
            tranversePreOrder(node.right);
        }
    }
    void tranverseInOrder(node09 node){
        if (node != null) {
            tranverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            tranverseInOrder(node.right);
        }
    }
    void tranversePostOrder(node09 node){
        if (node != null) {
            tranversePostOrder(node.left);
            tranversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    node09 getSuccessor(node09 del){
        node09 successor = del.right;
        node09 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        } 
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        node09 parent = root;
        node09 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            } 
        }
        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { //jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { //jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //jika punya 2 anak
                node09 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

}
