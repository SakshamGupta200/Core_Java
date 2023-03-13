package Encapsulation;

import java.util.Scanner;

class College1{
    private String StuName;
    private int RollNo;
    private String Email;
    private String Address;
    private int Age;

    void setStuName(String Stuname){
        this.StuName=Stuname;
    }
    void setRollNo(int RollNo){
        this.RollNo=RollNo;
    }
    void setEmail(String Email){
        this.Email=Email;
    }
    void setAddress (String Address){
        this.Address=Address;
    }
    void setAge(int Age){
        this.Age=Age;
    }
    String getStuName(){
        return StuName;
    }
    int getRollNo(int roll){
        return RollNo;
    }
    String getEmail(String email){
        return Email;
    }
    String getAddress(String add){
        return Address;
    }
    int getAge(int age){
        return Age;
    }
}

public class MultiStu {
    public static void main(String[] args) {
        College1 clg[]=new College1[5];
        Scanner sc=new Scanner(System.in);
        int i,roll=0,age=0;
        String name,email = null,add=null;


        for (i=0;i<2;i++){
            clg[i]=new College1();
            System.out.println("Enter "+i+" student details : ");
            name= sc.next();
            email= sc.next();
            add=sc.next();
            roll= sc.nextInt();
            age= sc.nextInt();
            clg[i].setStuName(name);
            clg[i].setEmail(email);
            clg[i].setAddress(add);
            clg[i].setRollNo(roll);
            clg[i].setAge(age);


        }
        for(i=0;i<2;i++){
            clg[i].getStuName();
            clg[i].getEmail(email);
            clg[i].getAddress(add);
            clg[i].getRollNo(roll);
            clg[i].getAge(age);
        }
    }



}
