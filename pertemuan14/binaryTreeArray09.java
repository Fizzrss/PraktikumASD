public class binaryTreeArray09 {
    mahasiswa09[] dataMahasiswa;
    int idxLast;

    public binaryTreeArray09() {
        this.dataMahasiswa = new mahasiswa09[10];
    }

    void populeData (mahasiswa09 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(mahasiswa09 data){
         if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
         } else {
            System.out.println("Tree Penuh, tidak bisa menambah data lagi");
         }
    }

    void traverseInOrder (int idxStart) {
        if(idxStart <= idxLast) {
            if(dataMahasiswa[idxStart] != null) {
                traverseInOrder(2* idxStart +1);
                dataMahasiswa [idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }   
    }

    void traversePreOrder (int idxStart) {
        if(idxStart <= idxLast) {
            if(dataMahasiswa[idxStart] != null) {
                dataMahasiswa [idxStart].tampilInformasi();
                traverseInOrder(2* idxStart +1);
                traverseInOrder(2*idxStart+2);
            }
        }   
    }
}
