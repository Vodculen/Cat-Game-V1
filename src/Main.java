import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner usersInput = new Scanner(System.in);
     
        Cat cats[] = createCats();

  
        List<Cat> party = new ArrayList<Cat>();

        Cat cat = userChooseCat(cats, usersInput);

        String town = usersChoosesTown(usersInput);

        System.out.println("The user chose "+cat+" and town '"+town+"'");
    }

    private static void wholeStartingMenuConfirmation(Cat[] cats, List<Cat> party) {
        Scanner usersInput = new Scanner(System.in);
        Cat userChoseThisCat;
        String fullStartingMenuYOrN;
        String townName = usersChoosesTown(usersInput);

        userChoseThisCat = userChooseCat(cats, usersInput);

        System.out.print("Do you want to start as " + userChoseThisCat.catName + " and call your town " + townName + "? Y or N: ");

        fullStartingMenuYOrN = usersInput.nextLine();

        if (fullStartingMenuYOrN.equalsIgnoreCase("Yes") || fullStartingMenuYOrN.equalsIgnoreCase("Y")) {
            System.out.println("Works");
        } 
        if (fullStartingMenuYOrN.equalsIgnoreCase("No") || fullStartingMenuYOrN.equalsIgnoreCase("N")) {
            userChooseCat(cats, usersInput);
        }
        else {
            System.out.println("Invalid choice! Please enter Y or N.");
            wholeStartingMenuConfirmation(cats, party);
        }
    }
    
    private static String usersChoosesTown(Scanner usersInput) {
        String townChoiceYOrN;
        String catTownName;

        System.out.print("What do you want to call your town: ");
        catTownName = usersInput.nextLine();
        System.out.print("Do you want to call your Town " + catTownName + "? Y or N: ");
        townChoiceYOrN = usersInput.nextLine();

        if (townChoiceYOrN.equalsIgnoreCase("Yes") || townChoiceYOrN.equalsIgnoreCase("Y")) {
            //TODO: wholeStartingMenuConfirmation(cats, party);
            //Error given cannot be solved with certainty
        }
        if (townChoiceYOrN.equalsIgnoreCase("No") || townChoiceYOrN.equalsIgnoreCase("N")) {
            usersChoosesTown(usersInput);
        }
        else {
            System.out.println("Invalid choice! Please enter Y or N.");
            usersChoosesTown(usersInput);
        }

        return catTownName;
    }

    private static Cat userChooseCat(Cat[] cats, Scanner usersInput) {
        String menuChoice;
        Cat userChoseThisCat = null;
        String menuChoiceYOrN;

        boolean userChoseCat = false;

        while (!userChoseCat) {


            System.out.println("Select One Cat:");
            for (int i = 0; i < cats.length; i++) {
                System.out.println(i + "> " + cats[i].catName);
            }
            System.out.println();


            System.out.print("Selected Cat: ");
            // menuChoice is a String containing the index of the cats array

            String userData = usersInput.nextLine(); // the string user typed in
            int userDataInt = Integer.parseInt(userData); // convert the user's input into an integer
            userChoseThisCat = cats[userDataInt];
            menuChoice = userChoseThisCat.catName;

            System.out.print("Do you want to be " + menuChoice + ", Y or N: ");

            menuChoiceYOrN = usersInput.nextLine();

            if (menuChoiceYOrN.equalsIgnoreCase("Yes") || menuChoiceYOrN.equalsIgnoreCase("Y")) {
                break;
            }
            if (menuChoiceYOrN.equalsIgnoreCase("No") || menuChoiceYOrN.equalsIgnoreCase("N")) {
                continue;
            }
            else {
                System.out.println("Invalid choice! Please enter Y or N. Try picking a cat again");
            }
        }

        return userChoseThisCat;
    }


    private static Cat[] createCats() {
           // Health values can be inbetween 30 and 50, while, everyother stat is inbetween 0 and 2

        Cat jax = new Cat("Jax", 50, 20, 20, 20);
        Cat ali = new Cat("Ali", 50, 20, 20, 20);
        Cat macaroni = new Cat("Macaroni", 50, 20, 20, 20);
        Cat zelda = new Cat("Zelda", 50, 20, 20, 20);
        Cat aurora = new Cat("Aurora", 50, 20, 20, 20);
        Cat charlie = new Cat("Charlie", 50, 20, 20, 20);
        Cat mocha = new Cat("Mocha", 50, 20, 20, 20);
        Cat latte = new Cat("Latte", 50, 20, 20, 20);
        Cat stella = new Cat("Stella", 50, 20, 20, 20);
        Cat luna = new Cat("Luna", 50, 20, 20, 20);
        Cat peanut = new Cat("Peanut", 50, 20, 20, 20);
        Cat tommy = new Cat("Tommy", 50, 20, 20, 20);
        Cat hilda = new Cat("Hilda", 50, 20, 20, 20);
        Cat hazel = new Cat("Hazel", 50, 20, 20, 20);
        Cat sammy = new Cat("Sammy", 50, 20, 20, 20);
        Cat curry = new Cat("Curry", 50, 20, 20, 20);
        Cat spots = new Cat("Spots", 50, 20, 20, 20);
        Cat meggy = new Cat("Meggy", 50, 20, 20, 20);
        Cat linus = new Cat("Linus", 50, 20, 20, 20);
        Cat kelder = new Cat("Kelder", 50, 20, 20, 20);
        Cat zima = new Cat("Zima", 50, 20, 20, 20);
        Cat fluffy = new Cat("Fluffy", 50, 20, 20, 20);
        Cat trees = new Cat("Trees", 50, 20, 20, 20);
        Cat grey = new Cat("Grey", 50, 20, 20, 20);
        Cat kisa = new Cat("Kisa", 50, 20, 20,20);

        Cat cats[] = { jax, ali, macaroni, zelda, aurora, charlie, mocha, latte, stella, luna, peanut, tommy, hilda,
            hazel, sammy, curry, spots, meggy, linus, kelder, zima, fluffy, trees, grey, kisa };



            for (int totalCats = 0; totalCats <= cats.length - 1; ++totalCats) {
                System.out.println(cats[totalCats].prettyString());
            }  

        return cats;
    }
}