// package basic;
import java.util.Scanner;

class bas{
    public static void main(String[] args){
        // name, mark, department
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double mark = scan.nextDouble(); // in java float is consider as a Douvle
        scan.nextLine();
        String dep = scan.nextLine();
        scan.close();
        System.out.println("Student name is "+ name); // Student name is madhan
        System.out.println("Student's mark is "+ mark/10 +"/10"); // Student's mark is 8.7/10
        System.out.print("Student's department is "+ dep); // Student's department is BBA

    }
}