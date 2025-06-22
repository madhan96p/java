package basic;
// just checking pass or fail
import java.util.Scanner;
//------------------------------------------------------------------------
// class mark{
//     public static void main(String agrs[]){
//         Scanner scan = new Scanner(System.in);
//         int Mark = scan.nextInt();

//         if (Mark>35){
//             System.out.print("Jaichitoom maraa");
//         }
//         else{
//             System.out.print("Parama padi-da");
//         }

//     }
// }
//----------------------------------------------------------------------
// class mark {
//     public static void main(String[] agrs){
//         Scanner scan = new Scanner(System.in);
//         int income = scan.nextInt();

//         if (income>=7000){
//             System.out.print("Average");
//         }
//         else{
//             System.out.print("Poor");
//         }
//     }
// }
//----------------------------------------------------------------------
// To find whethere is that number is divisable by 3 and 5

// class mark{
//     public static void main(String sgrs[]){
//         Scanner scan = new Scanner(System.in);
//         int a = 3;
//         int b = 5;

//         int user = scan.nextInt();
//         if (user%a == 0 && user %b==0){ // "%" - Modules reminder
//             System.out.print("Viraivil adaivai");
//         }
//         else{
//             System.out.print("Payirchi veandum mahaney");
//         }

//     }
// }
//----------------------------------------------------------------------
// class mark{
//     public static void main(String agrs[]){
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();

//         if (num%2==0){
//             System.out.print("the given number is "+num+" Even");
//         }
//         else{
//             System.out.print("The Given number is "+num+" Odd");
//         }
//     }
// }
//----------------------------------------------------------------------
// gamming if else code

// class mark{
//     public static void main(String agrs[]){
//         Scanner scan = new Scanner(System.in);
//         int score = scan.nextInt();

//         if(score < 50){
//             System.out.print("You need to improve");

//         }
//         else if(score>=50 && score<70){
//             System.out.print("Good");

//         }
//         else{
//             System.out.print("Execelltnt");
//         }
//     }
// }

// -----------------------------------------------------------------------
// special class code

class mark{
    public static void main(String agrs[]){
        Scanner scan= new Scanner(System.in);
        int tam = scan.nextInt();
        int eng = scan.nextInt();
        int mat = scan.nextInt();
        int sci = scan.nextInt();
        int soc = scan.nextInt();

        if ((tam+eng+mat+sci+soc)/5 < 35){
            System.out.print("Good Job... You can go no Special class needed");
        }
        else{
            System.out.print("Must attend Special Class");
        }
    }
}