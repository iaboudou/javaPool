public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        centerStar = new Star();
    }
    public Planet(String name, double x, double y, double z, Star c, int mass) {
        super(name, x, y, z, mass);
        centerStar = c;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star s) {
        this.centerStar = s;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode() , centerStar);
    }

    public boolean equals(Object  obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Planet s = (Planet) obj;
        return super.equals((CelestialObject) s) && centerStar.equals(s.centerStar);
    }

    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", 
            name, centerStar.name, CelestialObject.getDistanceBetween(centerStar, this) );
    }

}