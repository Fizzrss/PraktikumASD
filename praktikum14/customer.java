public class customer {
    public int id;
    public String name;

    public customer(){

    }

    public customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "ID: " + this.id + "nama: " + this.name;
    }
}