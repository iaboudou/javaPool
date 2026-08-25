public class CelestialObject {
    public double x, y, z;
    public String name;

    public CelestialObject() {
        this.name = "Soleil";
    }
    
    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }
}