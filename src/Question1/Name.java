package Question1;

import java.util.Scanner;

public class Name{
    public static void main(String args[]) {
        System.out.println("Enter your name please: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Repeated_Names(name);
    }
    static void Repeated_Names(String name){
        int length = name.length();
        for(int i = 0; i < length; i++){
            System.out.println(name);
        }
    }
}
