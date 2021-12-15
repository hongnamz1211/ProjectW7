package shape;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }


    @Override
    public String toString() {
        return "Square{side="
                + getSide()
                + ", color="
                + getColor()
                + ", filled="
                + isFilled()
                +"}";
    }
}
