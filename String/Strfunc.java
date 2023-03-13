package String;

public class Strfunc {
    public static void main(String arg[])
    {

        String s="   weH  HHH   ";
        String s1="welcome";
        String s2="g";
        int a=123;
        System.out.println(s);
        System.out.println("charAt()= "+s.charAt(0));
        System.out.println("compareTo()= "+s1.compareTo(s));
        System.out.println("compareToIgnoreCase()= "+s.compareToIgnoreCase(s1));
        System.out.println("concat()= "+s1.concat(s));
        System.out.println("endsWith()= "+s1.endsWith("ome"));
        System.out.println("equals()= "+s1.equals(s));
        System.out.println("equalsIgnoreCase()= " + s1.equalsIgnoreCase(s));
        System.out.println("hashCode()= "+s.hashCode());
        //System.out.println("indexOf()= "+s.indexOf(99));
        System.out.println("isEmpty()= "+s2.isEmpty());
        //System.out.println("lastIndexOf()= "+s.lastIndexOf(69));
        System.out.println("length()= "+s.length());
        System.out.println("replace()= "+s.replace('e','A'));
        System.out.println("replaceAll()= "+s.replaceAll("wel","AA"));
        System.out.println("subString()= "+s.substring(2,5));
        System.out.println("toLowerCase()= "+s.toLowerCase());
        System.out.println("toUpperCase()= "+s.toUpperCase());
        System.out.println("toString()="+"123.4".toString());
        System.out.println("trim()="+s.trim());
        //System.out.println("valueOf()="+s.valueOf());
        char d[]=s1.toCharArray();
        System.out.println("toCharArray()=" + d );
    }
}
