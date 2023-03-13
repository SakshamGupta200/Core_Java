package Encapsulation;

import java.util.Scanner;

class  Mahadev{
    private  String Course;
    void SetCourse(String Course){
        this.Course=Course;
    }
    String getCourse(){
        return Course;
    }
}

public class Student {
    public static void main(String[] args) {
        String C;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your course :");
        C= sc.nextLine();
        Mahadev obj=new Mahadev();
        obj.SetCourse(C);
        System.out.println("Your selected course is :"+obj.getCourse());
    }
}
