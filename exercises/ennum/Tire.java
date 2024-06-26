package exercises.ennum;

public class Tire {
    TypeOfTire type;
    int height;
    int width;
    double price;

    public Tire(TypeOfTire type, int height, int width, double price) {
        this.type = type;
        this.height = height;
        this.width = width;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "type=" + type +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                '}';
    }
}
