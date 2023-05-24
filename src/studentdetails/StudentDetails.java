/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetails;
import java.util.Scanner;

/**
 *
 * @author himanshu
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array of object declaration
        // Student[] list = new Student[2];
        // Student s1 = new Student();
        // s1.setName("Himanshu");
        // s1.setAge(19);
        // Student s2 = new Student();
        // s2.setName("Nandini");
        // s2.setAge(16);
        // list[0] = s1;
        // list[1] = s2;
        // System.out.println(list[0].getName() + " " + list[0].getAge());


        // Example of array of objects: -
        Student[] list = new Student[3];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.print("Write your name: ");
            String n = keyboard.next();
            System.out.print("Write your age: ");
            int a = keyboard.nextInt();
            Student s1 = new Student(n, a);
            list[i] = s1;
        }
        // Read the data i stored in array list
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
        
        // this is a branch
    }
    
}
