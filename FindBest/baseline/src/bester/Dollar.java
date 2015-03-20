package bester;

/**
 * Created by fcmeng on 3/20/15.
 */
public class Dollar implements Bestable {

    private final double value;
    private final double rate=6;

    public Dollar(double value) {
        this.value = value;
    }

    @Override
    public boolean betterThan(Bestable bestable) {
        return compareValue()>bestable.compareValue()? true: false;
    }

    @Override
    public double compareValue() {
        return value*rate;
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
