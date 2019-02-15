import java.util.Scanner;

public class Maingame {

    public static void main(String[] args) {
        Boolean funrun;

        Boolean run;
        Scanner input = new Scanner(System.in);
        Novice novice = new Novice("100");
        // Item items = new Item();
        // Bag bag = new Bag();

        System.out.print("Please Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome!" + " " + name);

        // System.out.println();
        //

        funrun = true;
        run = true;

        while (funrun) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("Enter 1 : Novice");
            System.out.println("Enter 2 : add Items");
            System.out.println("Enter 3 : show  Items");
            System.out.println("Enter 0 : Exit");
            System.out.println();

            System.out.print("Please Enter the number: ");
            int enter = input.nextInt();

            if (enter == 1) {
                novice.showInfo();
            }
            if (enter == 2) {

                System.out.println("Enter 1 : add Drug");
                System.out.println("Enter 2 : add Icecream");
                System.out.println("Enter 3 : add Water");
                  System.out.println("Enter 4 : add Pet");
                System.out.print("Please Enter the number: ");
                int key = input.nextInt();

                if (key == 1) {
                    novice.addItem("drug");
                }
                if (key == 2) {
                    novice.addItem("icecream");
                }
                if (key == 3) {
                    novice.addItem("water");
                }
                 if (key == 4) {
                    novice.addItem("pet");
                }
                if (key == 0) {
                    run = false;
                    System.out.println("Exit");
                }

            }
            if (enter == 3) {
                System.out.println("Items in  bag:) : ");
                novice.showItem();

            }
            if (enter == 0) {
                funrun = false;
                System.out.println();
                System.out.print("Good Luck ^^");
            }

        }
    }
}