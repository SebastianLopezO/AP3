public class Polvf1 {
    private int n;
    private float Vec[];

    //Metodo Constructor
    public Polvf1 (int grado){
        this.n = grado;
        this.Vec = new float[n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public float[] getVec() {
        return Vec;
    }

    public void setVec(float[] vec) {
        Vec = vec;
    }
}
