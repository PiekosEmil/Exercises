package exercises.ennum.drinks;

public enum TypeOfDrink {
    SOFT("Without alcohol"),
    SMOOTHIE("Contains fruits"),
    ALCOHOLIC("Contains alcohol");

    private String description;

    TypeOfDrink(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
