package overriding;

class Bank{
    int roi(){
        return 0;
    }

}
class SBI extends Bank{
    int roi(){
        return 7;
    }
}
class PNB extends Bank{
    int roi(){
        return 9;
    }
}

public class Riding2 {
    public static void main(String[] args) {
        SBI sbi=new SBI();
        PNB pnb=new PNB();
        System.out.println(sbi.roi());
        System.out.println(pnb.roi());
    }
}
