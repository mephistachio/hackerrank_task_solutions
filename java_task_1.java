/*Java: 
The Student Class Implement a student registration and student information retrieval system for a school using a simple class roster in Java. 
When a student is registered, the system must assign an integer ID (enrollment Number), starting at 1 and adding 1 as each student is registered. 
The student's name is stored with the assigned enrollmentNumber. The retrieval request should return a student's registration information. 
The Student class should implement: The constructor. Student(String name) The method String toString() to return the string" (enrollmentNumber): (name) 
The locked stub code in the editor validates the implementation of the Student class. 
After each student is registered, the code stub requests and prints the student's information to test your code. 
Constraints 1 snumberOfStudents is 10 
Input Format For Custom Testing 
The first line contains the value of numberOfStudents that describes the total number of students being registered. Each of the next numberOfStudents lines contains the student name */

import java.util.Scanner;

public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfStudents = Integer.parseInt(INPUT_READER.nextLine());

        while (numberOfStudents-- > 0) {
            String studentName = INPUT_READER.nextLine();
            Student student = new Student(studentName);
            System.out.println(student.toString());
        }

        INPUT_READER.close();
    }
}
