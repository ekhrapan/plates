package academy.belhard;

public class Plate {
    private final double radius;
    private final double depth;
    private final String label;

    public Plate(double radius, double depth, String label) {
        this.radius = radius;
        this.depth = depth;
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plate)) return false;
        Plate plate = (Plate) o;
        return plate.radius ==  radius && plate.depth == depth && plate.label.equals(label);
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius) + 7 * Double.hashCode(depth) + 13 * label.hashCode();
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                ", depth=" + depth +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public double getDepth() {
        return depth;
    }
}
