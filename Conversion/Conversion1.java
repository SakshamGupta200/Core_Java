package Conversion;

public class Conversion1 {
    public static void main(String[] args) {
        String n="100";
        int m=Integer.parseInt(n);
        System.out.println(m);
        System.out.println(n+200);
        System.out.println(m+200);
        int j=Integer.valueOf(n);
        System.out.println(j);
        int a=100;
        String st=String.valueOf(a);
        System.out.println(st);
        String str=Integer.toString(a);
        System.out.println(str);
    }
}
