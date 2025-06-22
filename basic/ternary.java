// package basic;
// import java.util.Scanner;
// class ternary{
//     public static void main(String[] agrs){
//         Scanner scan = new Scanner(System.in);
//         int num1 = scan.nextInt();
//         int num2 = scan.nextInt();
//         System.out.print(num1>num2?"one is greater":"Two is greater");
//     } 
// }

// ----------------------------------------------------------------
// import java.util.Scanner;

// class ternary{
//     public static void main(String[] agrs){
//         // print(madhan 10 times)
//         Scanner scan = new Scanner(System.in);
//         int times = scan.nextInt();
//         for(int i=1;i<times+1;i+=1){
//             System.out.println(times-i);
//         }
//         System.out.print("Task done");
//     }
// }

// ------------------------------------------------------------------
// get a input a and b and print from a to b

// import java.util.Scanner;

// class ternary{
//     public static void main(String[] agrs){
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         for ( ;a<=b;a=a+1){
//             System.out.println(a);
//         }
//     }
// }

// --------------------------------------------------------------------
// even num using for loop and if else/...

// import java.util.Scanner;

// class ternary{
//     public static void main(String[] agrs){
//         Scanner scan = new Scanner(System.in);
//         int range = scan.nextInt();

//         for (int i= 1; i<=range; i++){
//             if (i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// ---------------------------------------------------------------------
// count the num of odd numbers

import java.util.Scanner;

class ternary{
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        int cnt = 0;
        for (int i=1; i<=user; i++){
            if(i%2!=0){
                cnt ++;
            }
        }
        System.out.print(cnt);
    }
}