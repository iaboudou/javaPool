public class Star extends CelestialObject {
    private double magnitude;

    public Star() {
        super();
    }
    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return magnitude;
    }
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String toString() {
        return String.format("%s shines at the %.3f magnitude", name, this.magnitude);
    }

    public boolean equals(CelestialObject c) {
        return c == null ? false : this.x == c.x && this.y == c.y && this.z == c.z && this.name.equals(c.name) && this.magnitude == magnitude;
    }

    public int hashCode() {
        return java.util.Objects.hash(name, x, y, z, magnitude);
    }

}