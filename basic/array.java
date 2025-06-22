// basic array that how works

import java.util.Scanner;
import java.util.Arrays;

class array{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];

        nums[0] = scan.nextInt();
        nums[1] = scan.nextInt();
        nums[2] = scan.nextInt();
        nums[3] = scan.nextInt();
        nums[4] = scan.nextInt();

        System.out.print(Arrays.toString(nums));
    }
}