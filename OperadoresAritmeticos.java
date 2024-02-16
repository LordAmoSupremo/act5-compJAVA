import java.util.Scanner;

public class OperadoresAritmeticos {
    private double x;
    private double y;

    public OperadoresAritmeticos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double suma() {
        return x + y;
    }
    public double resta() {
        return x - y;
    }
    public double multiplicacion() {
        return x * y;
    }
    public double division() {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;
        }
    }

    public double modulo() {
        if (y != 0) {
            return x % y;
        } else {
            System.out.println("Error: No se puede calcular el módulo por cero.");
            return Double.NaN;
        }
    }

    public static OperadoresAritmeticos obtenerValoresDelUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor,introduce el valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Por favor, introduce el valor de Y: ");
        double y = scanner.nextDouble();

        return new OperadoresAritmeticos(x, y);
    }

    public void imprimirResultados() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Suma: " + suma());
        System.out.println("Resta: " + resta());
        System.out.println("Multiplicación: " + multiplicacion());
        System.out.println("División: " + division());
        System.out.println("Módulo: " + modulo());
    }

        public static void main(String[] args) {
        OperadoresAritmeticos operadores = obtenerValoresDelUsuario();
        operadores.imprimirResultados();
    }
}