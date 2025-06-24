import java.util.Scanner;

class user_if{
    public static void main(String[] args){
        // getting input from user "Win or Loose"

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        if(input.equals("Win")){
            System.out.print("Ee Shala nee jaichitta");
        }
        else{
            System.out.print("Poitu varrum");
        }
    }
}