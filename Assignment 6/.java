//Student.java

public class Student {
    String name;
    String year;
    double gpa;
    int id;

    public Student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }

    //new method
    void isHonorRoll(){
        if (this.gpa > 3.6){
            System.out.println(this.name + " is a honor roll student!");
        }else{
            System.out.println(this.name + " is not a honor roll student.");
        }
        }
    





    //new method
    void FreeLunch(int randomID){
        System.out.println(this.name + "'s ID: " + this.id);
        System.out.println("generated ID: " + randomID);

        if (this.id == randomID) {
            System.out.println(this.name + " gets free lunch today!");
        }else{
            System.out.println(this.name + " does not get free lunch today.");
        }
        System.out.println();
    
}
}
    


// Main.Java

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("James","2026" , 3.5, 12345678);
        System.out.println(student1.name);
        System.out.println(student1.year);
        System.out.println(student1.gpa);
        System.out.println(student1.id);



        Student student2 = new Student("Andrew", "2028", 3.8, 23905671);
        System.out.println(student2.name);
        System.out.println(student2.year);
        System.out.println(student2.gpa);
        System.out.println(student2.id);


        Student student3 = new Student("Jeremy", "2027", 3.1, 23470981);
        System.out.println(student3.name);
        System.out.println(student3.year);
        System.out.println(student3.gpa);
        System.err.println(student3.id);




        Student student4 = new Student("Ian", "2029", 3.9, 34512790);
        System.out.println(student4.name);
        System.out.println(student4.year);
        System.out.println(student4.gpa);
        System.out.println(student4.id);



        Student student5 = new Student("John", "2028", 2.7, 98765401);
        System.out.println(student5.name);
        System.out.println(student5.year);
        System.out.println(student5.gpa);
        System.out.println(student5.id);

        student1.isHonorRoll();
        student2.isHonorRoll();
        student3.isHonorRoll();
        student4.isHonorRoll();
        student5.isHonorRoll();

        Random rand = new Random();
        int randomID = 10000000 + rand.nextInt(90000000);

        student1.FreeLunch(randomID);
        student2.FreeLunch(randomID);
        student3.FreeLunch(randomID);
        student4.FreeLunch(randomID);
        student5.FreeLunch(randomID);
       

    }
}

// In this assignment, I learned how to create two types of methods relating to GPA and Random ID generator,  and was able to use them to check if students are on the honor roll and determine if they get free lunch based on a randomly generated ID.

