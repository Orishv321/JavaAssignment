package Assignment1_2.Q4_GeometricObject;

public class ComparableCylinder extends Cylinder implements Comparable<GeometricObject> {
    public ComparableCylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof ComparableCylinder) {
            ComparableCylinder other = (ComparableCylinder) o;
            if (this.getVolume() > other.getVolume()) {
                return 1;
            } else if (this.getVolume() < other.getVolume()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return super.compareTo(o);
        }
    }
}
