public class CelestialObject {
    public double x, y, z;
    public String name;
    public final static double KM_IN_ONE_AU =  150_000_000;

    public CelestialObject() {
        this.name = "Soleil";
    }
    
    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    // d = sqrt( (x1-x2)² + (y1-y2)² + (z1-z2)² )
    public static double getDistanceBetween(CelestialObject a, CelestialObject b) {
        return Math.sqrt( Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2) + Math.pow((a.z - b.z), 2) );
    }

    public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b) {
        return getDistanceBetween(a, b) * KM_IN_ONE_AU;
    }
}