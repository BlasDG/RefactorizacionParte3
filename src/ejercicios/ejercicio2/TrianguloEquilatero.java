package ejercicios.ejercicio2;

public class TrianguloEquilatero extends FiguraGeometrica implements Figura {
    public static final int NUM_LADOS = 3;
    public static final int DIVISOR_AREA = 4;
    private final int longitudLado;
    private int lado;

    public TrianguloEquilatero(int longitudLado) {
        this.longitudLado = longitudLado;
    }

    public int getLongitudLado() {
        return longitudLado;
    }

    private static double calcularAreaInterna(int ladoCuadrado, double raizTres) {
        return (ladoCuadrado * raizTres) / DIVISOR_AREA;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
