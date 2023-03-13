package Collcetion.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        int n;
        String S;
        Scanner sc=new Scanner(System.in);
        List <String> li=new ArrayList<String>();
        System.out.println("Enter number");
        n= sc.nextInt();
        System.out.println("Enter the string");
        for (int i=1;i<=n;i++){
            S= sc.nextLine();
            li.add(S);
        }
        System.out.println("List Detail");
        System.out.println(li);
        for (String S1:li){
            System.out.println(S1);
        }
    }
}
