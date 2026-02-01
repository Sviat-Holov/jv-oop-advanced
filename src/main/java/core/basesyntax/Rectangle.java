package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator,Drawable {
    private double side1;
    private double side2;

    public Rectangle(String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + getArea() + " sq. units, color: " + getColor());
    }
}
