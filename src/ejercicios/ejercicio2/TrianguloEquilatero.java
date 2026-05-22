package ejercicios.ejercicio2;

public class TrianguloEquilatero {
    public static final int NUM_LADOS = 3;
    public static final int DIVISOR_AREA = 4;
    private final int longitudLado;

    public TrianguloEquilatero(int lado) {
        this.longitudLado = lado;
    }

    public int getLongitudLado() {
        return longitudLado;
    }
    public int calcularPerimetro() {
        return longitudLado * NUM_LADOS;
    }
    public double getArea() {
        double raizTres = Math.sqrt(3);
        int ladoCuadrado = longitudLado * longitudLado;
        return calcularAreaInterna(ladoCuadrado, raizTres);
    }

    private static double calcularAreaInterna(int ladoCuadrado, double raizTres) {
        return (ladoCuadrado * raizTres) / DIVISOR_AREA;
    }
}
