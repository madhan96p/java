import java.util.Scanner;

// if else... 

class demoif{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean alive = Boolean.parseBoolean(scan.nextLine()); // true in java "T" in small

        if(alive){
            System.out.print("Vealangidum");
        }
        else{
            System.out.print("Romba nallathu");
        }
    }
}