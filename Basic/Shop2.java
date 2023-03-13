package Basic;

class Shp{
    String name;
    String address;
    long contact;
   static int visitors=0;

    Shp(String name, String address, long contact){
        this.name = name;
        this.contact=contact;
        this.address=address;
        visitors++;
    }
}public class Shop2 {
    public static void main(String[] args) {
        Shp ram,shyam,mohan,ritu;
        ram=new Shp("Ram","Delhi",2554615345L);
    }
}
