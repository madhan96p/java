// basic array that how works

// import java.util.Scanner;
// import java.util.Arrays;

// class array{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         int[] nums = new int[5];

//         nums[0] = scan.nextInt();
//         nums[1] = scan.nextInt();
//         nums[2] = scan.nextInt();
//         nums[3] = scan.nextInt();
//         nums[4] = scan.nextInt();

//         System.out.print(Arrays.toString(nums));
//     }
// }
// -----------------------------------------------------------------

// Get inputs for 5 numbers using arrays and for loop....?

// import java.util.Scanner;
// import java.util.Arrays;

// class array{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         // Arrays user = scan.next
//         int[] nums = new int[5];

//         for(int i=0; i<5; i++ ){
//             nums[i] = scan.nextInt();
//         }
//         scan.close();
//         System.out.print(nums[0]+" "+nums[1]+" "+nums[2]+" "+nums[3]+" "+nums[4]);

//     }
// }

// ---------------------------------------------------------------------------------
// tables printing 5 & 7

// import java.util.Scanner;

// class array{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         int tables = scan.nextInt();
//         for (int i=1; i<=10;i++){
//             System.out.println(i+"x"+tables+"="+i*tables);
//         }
//     }
// }

// --------------------------------------------------------------------------------
// getting an size of array as input and asking that tin=mes of input and then mid value of array
import java.util.Scanner;

class array{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] lens = new int[size];
        int mid = size/2;
        for (int i=0; i<size; i++){
            lens[i] = scan.nextInt();
        }
        scan.close();
        System.out.print(lens[mid]);
    }
}