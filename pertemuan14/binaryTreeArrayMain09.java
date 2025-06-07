public class binaryTreeArrayMain09 {
    public static void main(String[] args) {
        binaryTreeArray09 bta = new binaryTreeArray09();

        mahasiswa09 mhs1 = new mahasiswa09("244160121", "Ali", "A", 3.57);
        mahasiswa09 mhs2 = new mahasiswa09("244160185", "Candra", "C", 3.41);
        mahasiswa09 mhs3 = new mahasiswa09("244160221", "Badar", "B", 3.75);
        mahasiswa09 mhs4 = new mahasiswa09("244160220", "Dewi", "B", 3.35);

        mahasiswa09 mhs5 = new mahasiswa09("244160131", "Devi", "A", 3.48);
        mahasiswa09 mhs6 = new mahasiswa09("244160205", "Ehsan", "D", 3.61);
        mahasiswa09 mhs7 = new mahasiswa09("244160170", "Fizi", "B", 3.86);

        mahasiswa09[] dataMahasiswas = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null };
        int idxLast = 6;

        
        bta.populeData(dataMahasiswas, idxLast);
        
        bta.add(new mahasiswa09("24410706", "Diyah", "B", 3.90));
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
        System.out.println("\nPreorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

    }
}