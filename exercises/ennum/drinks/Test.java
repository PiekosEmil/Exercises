package exercises.ennum.drinks;

import java.util.Scanner;

public class Test {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Test test = new Test();
        DrinkBar drinkBar = new DrinkBar();
        drinkBar.printDrinks();
        drinkBar.chooseDrink(test.scanner);
    }
}
