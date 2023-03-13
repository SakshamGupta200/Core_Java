package Encapsulation;

import java.util.Scanner;

class College{
    private String StuName;
    private int RollNo;
    private String Email;
    private String Address;
    private int Age;

    void SetStuname(String Stuname){
        this.StuName=Stuname;
    }
    void SetRollNo(int RollNo){
        this.RollNo=RollNo;
    }
    void SetEmail(String Email){
        this.Email=Email;
    }
    void SetAddress (String Address){
        this.Address=Address;
    }
    void SetAge(int Age){
        this.Age=Age;
    }
    String getStuName(){
        return StuName;
    }
    int getRollNo(){
        return RollNo;
    }
    String getEmail(){
        return Email;
    }
    String getAddress(){
        return Address;
    }
    int getAge(){
        return Age;
    }
}


public class StuDetail {
    public static void main(String[] args) {
        int roll,age;
        String name,add,email;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        name=sc.next();

        System.out.println("Enter your rollno :");
        roll= sc.nextInt();

        System.out.println("Enter your email :");
        email= sc.next();

        System.out.println("Enter your address :");
        add= sc.next();

        System.out.println("Enter your age :");
        age= sc.nextInt();

        College clg=new College();

        clg.SetStuname(name);
        System.out.println("Name: "+clg.getStuName());

        clg.SetRollNo(roll);
        System.out.println("Roll No :"+clg.getRollNo());

        clg.SetEmail(email);
        System.out.println("Email :"+clg.getEmail());

        clg.SetAddress(add);
        System.out.println("Address : "+clg.getAddress());

        clg.SetAge(age);
        System.out.println("Age : "+clg.getAge());
    }
}
