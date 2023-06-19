import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String Word;
        String backwards = "";
        System.out.println("Please enter a word or a phrase to be reversed: ");
        Word = scan.nextLine();
        System.out.println("Your word normal is: " + Word);
        for(int i = 0; i<Word.length(); i++){
            backwards = Word.charAt(i) + backwards; //Adds previous character in front of current char
            //This reverses the string 
            //the first char ends up as the last char.
        }
        System.out.println("Your word or phrase flipped backwards is: " + backwards);
    }
}
