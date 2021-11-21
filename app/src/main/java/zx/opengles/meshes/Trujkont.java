package zx.opengles.meshes;

public class Trujkont extends BaseMesh {
    private float size = 2;
    public Trujkont() {


        final float[] positionData = {
                1.0f, -1.0f, 1.0f,
                0.0f, 1.0f, 0.0f,
                -1.0f, -1.0f, 1.0f,

                1.0f, -1.0f, -1.0f,
                0.0f, 1.0f, 0.0f,
                1.0f, -1.0f, 1.0f,

                -1.0f, -1.0f, -1.0f,
                0.0f, 1.0f, 0.0f,
                1.0f, -1.0f, -1.0f,

                -1.0f, -1.0f, 1.0f,
                0.0f, 1.0f, 0.0f,
                -1.0f, -1.0f, -1.0f,

                // Dolna ściana
                1.0f, -1.0f, -1.0f,
                1.0f, -1.0f, 1.0f,
                -1.0f, -1.0f, -1.0f,
                1.0f, -1.0f, 1.0f,
                -1.0f, -1.0f, 1.0f,
                -1.0f, -1.0f, -1.0f
        };

        // Współrzędne tekstury są takie same dla wszystkich ścian.
        final float[] texCoordData = {
                0.0f, 0.0f,
                0.5f, 1.0f,
                1.0f, 0.0f,

                0.0f, 0.0f,
                0.5f, 1.0f,
                1.0f, 0.0f,

                0.0f, 0.0f,
                0.5f, 1.0f,
                1.0f, 0.0f,

                0.0f, 0.0f,
                0.5f, 1.0f,
                1.0f, 0.0f,

                0.0f, 0.0f,
                0.0f, 1.0f,
                1.0f, 0.0f,
                0.0f, 1.0f,
                1.0f, 1.0f,
                1.0f, 0.0f
        };

        final float[] normalData = {
                0.0f,1.0f,1.0f,
                0.0f,1.0f,1.0f,
                0.0f,1.0f,1.0f,

                1.0f,1.0f,0.0f,
                1.0f,1.0f,0.0f,
                1.0f,1.0f,0.0f,

                0.0f,1.0f,-1.0f,
                0.0f,1.0f,-1.0f,
                0.0f,1.0f,-1.0f,

                -1.0f,1.0f,0.0f,
                -1.0f,1.0f,0.0f,
                -1.0f,1.0f,0.0f,

                // Dolna ściana
                0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f
        };

        numberOfVertices = 18;

        positionBuffer = createBuffer(positionData);
        texCoordsBuffer = createBuffer(texCoordData);
        normalBuffer = createBuffer(normalData);
    }
}
