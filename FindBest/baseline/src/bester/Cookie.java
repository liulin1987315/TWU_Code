package bester;

public class Cookie implements Bestable {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public boolean betterThan(Bestable bestable) {
        return compareValue() > bestable.compareValue() ? true : false;
    }

    @Override
    public double compareValue() {
        return numberOfChocolateChips;
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
}
