import java.util.Scanner;
public class ApplePie{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double apple = 6.0;//full apples
        double sugar = 0.75; //cups
        double flour = 2.0; //cups
        double cinnamon = 0.75; //tablespoons
        double salt = 0.25; //tablespoons
        double nutmeg = 0.1;//teaspoons
        double people;

        System.out.println("How many people for your party?");
        people = scan.nextDouble();
        if(people==5){
            System.out.println("You will need:/n");
            System.out.println("apples: "  + apple);
            System.out.println("Sugar: " + sugar+" cups");
            System.out.println("Flour: " + flour+" cups");
            System.out.println("Cinnamon: "+ cinnamon+" tablespoons");
            System.out.println("Salt: " + salt+" tablespoons");
            System.out.println("Nutmeg: " + nutmeg+" teaspoons");
        }
        if(people>5){
            double additional= people-5;
            double increment = additional * 1.25;
            apple = 6.0 * increment;//full apples
            sugar = 0.75 * increment; //cups
            flour = 2.0 * increment; //cups
            cinnamon = 0.75 * increment; //tablespoons
            salt = 0.25 * increment; //tablespoons
            nutmeg = 0.1 * increment;//teaspoons
            System.out.println("You will need:/n");
            System.out.println("apples: "  + apple);
            System.out.println("Sugar: " + sugar+" cups");
            System.out.println("Flour: " + flour+" cups");
            System.out.println("Cinnamon: "+ cinnamon+" tablespoons");
            System.out.println("Salt: " + salt+" tablespoons");
            System.out.println("Nutmeg: " + nutmeg+" teaspoons");
        }
        if(people<5){            
            double guests = people * 1.25;
            apple = 6.0 * guests;//full apples
            sugar = 0.75 * guests; //cups
            flour = 2.0 * guests; //cups
            cinnamon = 0.75 * guests; //tablespoons
            salt = 0.25 * guests; //tablespoons
            nutmeg = 0.1 * guests;//teaspoons
            System.out.println("You will need:/n");
            System.out.println("apples: "  + apple);
            System.out.println("Sugar: " + sugar+" cups");
            System.out.println("Flour: " + flour+" cups");
            System.out.println("Cinnamon: "+ cinnamon+" tablespoons");
            System.out.println("Salt: " + salt+" tablespoons");
            System.out.println("Nutmeg: " + nutmeg+" teaspoons");
        }

    }
}