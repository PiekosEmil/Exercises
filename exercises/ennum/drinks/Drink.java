package exercises.ennum.drinks;

public class Drink {
    private String name;
    private int price;
    private TypeOfDrink type;

    public Drink(String name, int price, TypeOfDrink type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " " +
                price + "USD, " +
                type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public TypeOfDrink getType() {
        return type;
    }
}
