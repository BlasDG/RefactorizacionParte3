package ejercicios.ejercicio2;

public class FiguraGeometrica {
    public int calcularPerimetro() {
        return longitudLado * TrianguloEquilatero.NUM_LADOS;
    }

    public double getArea() {
        double raizTres = Math.sqrt(3);
        int ladoCuadrado = longitudLado * longitudLado;
        return TrianguloEquilatero.calcularAreaInterna(ladoCuadrado, raizTres);
    }
}
