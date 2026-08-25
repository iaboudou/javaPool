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

    public java.util.Map<String, Integer> computeMassRepartition() {
        java.util.Map<String, Integer> m = new java.util.HashMap<>();

        m.put("Star", 0);
        m.put("Planet", 0);
        m.put("Other", 0);

        for (CelestialObject cel : celestialObjects) {
            if (cel instanceof Star) {
                m.put("Star", m.get("Star") + cel.mass);
            }
            else if (cel instanceof Planet) {
                m.put("Planet", m.get("Planet") + cel.mass);
            }
            else {
                m.put("Other", m.get("Other") + cel.mass);
            }
        }
        return m;
    }
}