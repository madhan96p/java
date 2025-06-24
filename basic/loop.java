// import java.util.Scanner;
// // to print nested for loop... tht to print "*" is three times in three line
// class loop{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);

//         System.out.print("number of lines: ");
//         int lines = scan.nextInt();
        
//         System.out.print("number of times: ");
//         int times = scan.nextInt();
        
//         for (int i = 0; i<lines; i++){
//             System.out.println();
//             for (int j = 1; j<=times;j++ ){
//                 System.out.print("*");
//             }
//         }
//     }
// }
// ---------------------------------------------------------------------------------
// *
// **
// *** to print this output--->

// import java.util.Scanner;

// class loop{
//     public static void main(String[] args){
//         for(int i = 1; i<=3;i++){
//             for(int j =1 ; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// ---------------------------------------------------------------------------
// While loop

// import java.util.Random;

// class loop{
//     public static void main(String[] args){
//         Random num = new Random();
//         int j = 1;
//         while(j!=5){
//             j = num.nextInt(101);
//             System.out.print(j+" ");
//         }
//     }
// }

// --------------------------------------------------------------------------
// Do while loop
// \\\\\\\\\\\\\ //
// ask user to enter his password and his password is "Madhan@1482" - until the pass code is correct rerun the loop
import java.util.Scanner;

class loop{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String name = "password";
        do{
            System.out.print("Enter your password: ");
            name = scan.nextLine();
            scan.close();
        }while(!name.equals("Madhan@1482"));
    }
}