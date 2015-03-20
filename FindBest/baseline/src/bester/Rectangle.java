package bester;

public class Rectangle implements Bestable {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public boolean betterThan(Bestable bestable) {
        return compareValue()>bestable.compareValue()? true: false;
    }

    @Override
    public double compareValue() {
        return area();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Bestable bestable= (Bestable) o;

        if (compareValue() != bestable.compareValue()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int)(compareValue());
    }

    public double area() {
        return length * breadth;
    }

}
