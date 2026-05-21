package ejercicios.ejercicio2;

public class longitudLado {
    public static final int NUM_LADOS = 3;
    public static final int DIVISOR_AREA = 4;
    private final int lado;

    public longitudLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    public int calcularPerimetro() {
        return lado * NUM_LADOS;
    }
    public double getArea() {
        double raizTres = Math.sqrt(3);
        return (lado * lado * raizTres) / DIVISOR_AREA;
    }

}
