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

    void traverseInOrder (int idxStart) {
        if(idxStart <= idxLast) {
            if(dataMahasiswa[idxStart] != null) {
                traverseInOrder(2* idxStart +1);
                dataMahasiswa [idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }   
    }
}
