package ejercicios.ejercicio2;

public class FiguraGeometrica {
    private int longitudLado;

    static double calcularAreaInterna(int ladoCuadrado, double raizTres) {
        return (ladoCuadrado * raizTres) / TrianguloEquilatero.DIVISOR_AREA;
    }

    public int calcularPerimetro() {
        return longitudLado * TrianguloEquilatero.NUM_LADOS;
    }

    public double getArea() {
        double raizTres = Math.sqrt(3);
        int ladoCuadrado = longitudLado * longitudLado;
        return FiguraGeometrica.calcularAreaInterna(ladoCuadrado, raizTres);
    }

    public int getLado() {
        return longitudLado;
    }
}
