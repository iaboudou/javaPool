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

    public boolean equals(Object obj) {
        
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Star c = (Star) obj;

        return super.equals(c) && this.magnitude == c.magnitude;
    }

    public int hashCode() {
        return java.util.Objects.hash(name, x, y, z, magnitude);
    }

}