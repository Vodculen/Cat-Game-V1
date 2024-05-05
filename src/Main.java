import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        // Health values can be inbetween 30 and 50, while, everyother stat is inbetween
        // 0 and 20

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

        Cat cats[] = { jax, ali, macaroni, zelda, aurora, charlie, mocha, latte, stella, luna, peanut, tommy, hilda,
                hazel, sammy, curry, spots, meggy, linus, kelder, zima, fluffy, trees, grey };

        for (int totalCats = 0; totalCats <= cats.length; ++totalCats) {
            System.out.println(cats[totalCats].prettyString());
        }

        List<Cat> party = new ArrayList<Cat>();

        Scanner usersInput = new Scanner(System.in);
        Cat userChoseThisCat;
        String fullStartingMenuYOrN;

        do {

            userChoseThisCat = userChooseCat(cats, usersInput);
            party.add(userChoseThisCat);

            String denName = usersChoosesTown(usersInput);

            System.out.print("Do you want to start as " + userChoseThisCat.catName + " and call your town " + denName
                    + "? Y or N: ");
            fullStartingMenuYOrN = usersInput.nextLine();

            switch (fullStartingMenuYOrN) {
                case "y":
                case "Y":

                    break;
                case "n":
                case "N":

                    break;

                default:
                    System.out.println("Invalid choice. Please enter Y or N.");
                    break;

            }

        }

        while (fullStartingMenuYOrN != null
                && (fullStartingMenuYOrN.equalsIgnoreCase("N") || fullStartingMenuYOrN.equalsIgnoreCase("n")));

        String taskChoice = usersInput.nextLine();

        switch (taskChoice) {
            case "Wood":
                Task.taskWood();
                break;

            default:
                break;
        }

    }

    private static String usersChoosesTown(Scanner usersInput) {
        String denChoiceYOrN;
        String catTownName;

        do {
            System.out.print("What do you want to call your town: ");
            catTownName = usersInput.nextLine();
            System.out.print("Do you want to call your Town " + catTownName + "? Y or N: ");
            denChoiceYOrN = usersInput.nextLine();

        } while (denChoiceYOrN != null && (denChoiceYOrN.equalsIgnoreCase("N") || denChoiceYOrN.equalsIgnoreCase("n")));
        return catTownName;
    }

    // List all available cats and let user choose one.
    // Get user confirmation, if no, list cats again.
    // returns the cat
    private static Cat userChooseCat(Cat[] cats, Scanner usersInput) {
        String menuChoice;
        Cat userChoseThisCat;
        String menuChoiceYOrN;
        do {

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

        } while (menuChoiceYOrN != null && (menuChoiceYOrN.equalsIgnoreCase("N")));

        return userChoseThisCat;
    }
}