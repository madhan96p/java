package basic;
import java.util.Scanner;

// if else... 

// class demoif{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         boolean alive = Boolean.parseBoolean(scan.nextLine()); // true in java "T" in small

//         if(alive){
//             System.out.print("Vealangidum");
//         }
//         else{
//             System.out.print("Romba nallathu");
//         }
//     }
// }

// getting input from user and asign in variable then we move that into if - else ....

class demoif{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        scan.nextLine();
        int num2 = scan.nextInt();
        scan.close();
        if(num1==num2){
            System.out.print("Yep both nums are Equal");
        }
        // elif(num1>num2){
        //     System.out.print("Boom number one is greater then number two..."+ num1);
        // }
        else{
            System.out.print("Oho no... nums are not equal and num one is not greater then num1");
        }
    }
}