import java.util.Scanner;
public class MCoco {
    public static void main(String[] args){
        
        
        double meter = 5.88;
        double kilometer = 588.2;
        double CM = 0.0588;
        Scanner scan = new Scanner(System.in);
        String unit;
        
        Double volume;
        Double m;
        
        String decision;
 //_______________________________________________________________________________________________       
        Double kilogram = 1.4;
        Double gram = 0.014;
        Double miligram = 0.0014;
        String d;
        System.out.println("Would you like to do a length, weight, or volumetric measurement?");
        decision = scan.nextLine();
        
//________________________________________________________________________________________________
        Double width;
        Double Height;
        Double length;
        Double volCoco = 1767.15 * CM;
        Double Space;
//________________________________________________________________________________________________

        if(decision.equals("weight")){
            System.out.println("Would you like to convert miligrams, grams, or kilograms?: ");
            d = scan.nextLine();
            if(d.equals("miligrams")){
                System.out.println("How may miligrams?: ");
                m = scan.nextDouble();
                System.out.println(m + " miligrams weighs as much as " + m*miligram+ "  Coconuts");
            }
            else if(d.equals("grams")){
                System.out.println("How may grams?: ");
                m = scan.nextDouble();
                System.out.println(m + " grams weighs as much as " + m*gram+ "  Coconuts");
            }
            else if(d.equals("kilograms")){
                System.out.println("How may kilograms?: ");
                m = scan.nextDouble();
                System.out.println(m + " kilograms weighs as much as " + m*kilogram+ "  Coconuts");
            }
        }
        
        if (decision.equals("length"))
        {
            System.out.println("Would you like to convert meters, centimeters, or kilometers?: ");
        unit = scan.nextLine();
        if(unit.equals("meters")){
            System.out.println("How many meters: ");
            m = scan.nextDouble();
            System.out.println(m + "meters is " + m*meter +" coconuts long");
        }
        else if(unit.equals("centimeters")){
            System.out.println("How many centimeters?: ");
            m = scan.nextDouble();
            System.out.println( m +" centimeters is " + m * CM + " coconuts long");
        }
        else if(unit.equals("kilometers")){
            System.out.println("How many kilometes?: ");
            m = scan.nextDouble();
            System.out.println( m +" kilometers is " + m * kilometer + " coconuts long");
    
            }
        }   
        if(decision.equals("volumetric measurement")){
            System.out.println("Wait one sec");
            System.out.println("You will be using the volume of a room");
            System.out.println("What is the length of the room?");
            length = scan.nextDouble();
            System.out.println("Enter the width of a room");
            width  = scan.nextDouble();
            System.out.println("Enter a height for the room");
            Height=  scan.nextDouble();
            volume =Math.pow(length*width*Height,3);
            System.out.println("The volume of the room is " + volume + " Cubic meters");
            Space = volume/volCoco;
            System.out.println("It would take " + Space + " Coconuts to fill this room."); 
        }
    }
}
