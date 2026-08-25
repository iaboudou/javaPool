public class CelestialObject {
    public double x, y, z;
    public int mass;
    public String name;
    public final static double KM_IN_ONE_AU =  150_000_000;

    public CelestialObject() {
        this.name = "Soleil";
    }
    
    public CelestialObject(String name, double x, double y, double z, int mass) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.mass = mass;
    }

    // d = sqrt( (x1-x2)² + (y1-y2)² + (z1-z2)² )
    public static double getDistanceBetween(CelestialObject a, CelestialObject b) {
        return Math.sqrt( Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2) + Math.pow((a.z - b.z), 2) );
    }

    public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b) {
        return getDistanceBetween(a, b) * KM_IN_ONE_AU;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMass() {
        return "" + this.mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }

    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }

    public boolean equals(Object obj) {

        CelestialObject c = (CelestialObject) obj;
        return c == null ? false : this.x == c.x && this.y == c.y && this.z == c.z && this.name.equals(c.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(name, x, y, z);
    }
}