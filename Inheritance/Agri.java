package Inheritance;

class  T1{
    int fact(int a){
        int f=1;
        for (int i=a;i>=1;i--){
            f=f*i;

        }
        return f;
    }
}
public class Agri {
    public static void main(String[] args) {
        T1 Ob=new T1();
        for (int j=1;j<=10;j++){
            int f=Ob.fact(j);
            System.out.println(f);
        }
    }
}
