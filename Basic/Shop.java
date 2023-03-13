package Basic;

class Shop1{
    String name;
    String address;
    Long contactNum;
    static int count;

    Shop1(String name,String address,Long contactNum){
        this.name=name;
        this.address =address;
        this.contactNum =contactNum;
        count++;
    }
}
public class Shop {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Shop1 c1 = new Shop1("Ram","Address1",1231231231L);
        Shop1 c2 = new Shop1("Sam","Address2",2222222222L);
        Shop1 c3 = new Shop1("Lal","Address3",33333333333L);
        Shop1 c4 = new Shop1("Tom","Address4",44444444444L);
        System.out.println("There are " + Shop1.count + " customers");

    }
}
