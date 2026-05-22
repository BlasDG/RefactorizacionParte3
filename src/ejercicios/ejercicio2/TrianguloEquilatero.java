package ejercicios.ejercicio2;

public class TrianguloEquilatero extends FiguraGeometrica implements Figura {
    public static final int NUM_LADOS = 3;
    public static final int DIVISOR_AREA = 4;
    public final int longitudLado;
    private int lado;

    public TrianguloEquilatero(int longitudLado) {
        this.longitudLado = longitudLado;
    }

    public int getLongitudLado() {
        return longitudLado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
