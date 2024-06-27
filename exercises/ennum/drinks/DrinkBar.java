package exercises.ennum.drinks;

import java.util.*;

public class DrinkBar {
    Drink drink1 = new Drink("Mojito", 20, TypeOfDrink.ALCOHOLIC);
    Drink drink2 = new Drink("Mad dog", 15, TypeOfDrink.ALCOHOLIC);
    Drink drink3 = new Drink("Swimming pool", 25, TypeOfDrink.SMOOTHIE);
    Drink drink4 = new Drink("Lemoniada", 10, TypeOfDrink.SOFT);

    Map<String, Drink> drinks = Map.of(drink1.getName(), drink1,
            drink2.getName(), drink2,
            drink3.getName(), drink3,
            drink4.getName(), drink4);

    void printDrinks() {
        for (Drink drink : drinks.values()) {
            System.out.println(drink);
        }
        System.out.println();
    }

    void printPrice(String name) {
        System.out.println("You have to pay");
        System.out.println(drinks.get(name).getPrice() + "USD");
    }

    void chooseDrink(Scanner scanner) {
        System.out.println("Which drink you choose?");
        try {
            String name = scanner.nextLine();
            if (drinks.get(name).getType().equals(TypeOfDrink.ALCOHOLIC)) {
                System.out.println("Input your age");
                try {
                    int age = scanner.nextInt();
                    if (age > 100 || age <= 0) {
                        throw new InputMismatchException();
                    }
                    if (age >= 18) {
                        printPrice(name);
                    } else if (age < 18) {
                        System.out.println("We don't sell an alcohol for minors");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wrong age");
                }
            } else {
                printPrice(name);
            }
        } catch (NullPointerException e) {
            System.out.println("We don't sell this drink!");
        }
    }
}
