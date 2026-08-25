public class Galaxy {
    private java.util.List<CelestialObject> celestialObjects;

    public Galaxy(){
        celestialObjects = new java.util.ArrayList<CelestialObject>();
    }

    public java.util.List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject arg) {
        celestialObjects.add(arg);
    }
}