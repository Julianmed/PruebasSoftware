public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        double a = 3;
        double b = 4;

        double c = Calculadora.Dividir(a, b);
        System.out.println(c);
    }

    public static double Sumar (double a, double b) {
        double c;

        c = a + b;

        return c;
    }

    public static double Restar (double a, double b) {
        double c;

        c = a - b;

        return c;
    }

    public static double Multiplicar (double a, double b) {
        double c;

        c = a * b;

        return c;
    }

    public static double Dividir (double a, double b) {
        double c = 0;
            if (b != 0){
                c = a / b;
            }
            else {
                System.out.println("Error al intentar dividir por cero");
            }
        return c;
    }
}
