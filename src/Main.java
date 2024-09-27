import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);


    System.out.println("What party are you affiliated with [R,D,I]");
    String party = in.nextLine();

    if (party.equals("R")) {
        System.out.println("You get a Republican Elephant!");
    }
    else if (party.equals("D")) {
        System.out.println("You get a Democratic Donkey!");
    }
    else if (party.equals("I")) {
        System.out.println("You get a Independent Man!");
    }
    else {
        System.out.println("Please enter a valid party!");
    }















    }
}