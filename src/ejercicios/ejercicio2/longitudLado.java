package ejercicios.ejercicio2;

public class longitudLado {
    private final int lado;

    public longitudLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    public int calcularPerimetro() {
        return lado * 3;
    }
    public double getArea() {
        return (lado * lado * Math.sqrt(3)) / 4;
    }

}
