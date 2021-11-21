package zx.opengles.helpers;

/**
 @author Marek Kulawiak
 */

// Klasa kontenerowa do przechowywania trójwymiarowych współrzędnych.
public class Vector3
{
    public float x;
    public float y;
    public float z;

    public Vector3(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3(Vector3 pos)
    {
        this(pos.x, pos.y, pos.z);
    }

    public Vector3()
    {
        this(0, 0, 0);
    }

    public void add(Vector3 pos)
    {
        x += pos.x;
        y += pos.y;
        z += pos.z;
    }

    public Vector3 multiply(float value)
    {
        x *= value;
        y *= value;
        z *= value;
        return new Vector3(this);
    }

    public float[] toFloatArray()
    {
        float[] vals = new float[4];
        vals[0] = x;
        vals[1] = y;
        vals[2] = z;
        vals[3] = 0;
        return vals;
    }
}
