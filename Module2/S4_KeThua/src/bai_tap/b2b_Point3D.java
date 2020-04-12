package bai_tap;

public class b2b_Point3D extends b2a_Point2D {
    private float z = 0.0f;

    public b2b_Point3D() {
        super();
    }

    public b2b_Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), this.getZ()};
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
//        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
    }
}
