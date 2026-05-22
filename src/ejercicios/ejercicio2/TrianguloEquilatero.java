package ejercicios.ejercicio2;

public class TrianguloEquilatero implements Figura {
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
    @Override
    public int calcularPerimetro() {
        return longitudLado * NUM_LADOS;
    }
    @Override
    public double getArea() {
        double raizTres = Math.sqrt(3);
        int ladoCuadrado = longitudLado * longitudLado;
        return calcularAreaInterna(ladoCuadrado, raizTres);
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
