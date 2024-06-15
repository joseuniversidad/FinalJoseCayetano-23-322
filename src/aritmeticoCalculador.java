public class aritmeticoCalculador {
    private double number1;
    private double number2;
    private char operador;
    private double resultado;

    public aritmeticoCalculador(double number1, double number2, char operadora) {
        this.number1 = number1;
        this.number2 = number2;
        this.operador = operadora;
    }

    public void verificacion() {
        switch (operador) {
            case '+':
                resultado = number1 + number2;
                break;
            case '-':
                resultado = number1 - number2;
                break;
            case '*':
                resultado = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    resultado = number1 / number2;
                } else {
                    System.out.println("No se puede dividir en 0");
                    return;
                }
                break;
            default:
                System.out.println("No esta ese operador");
                return;
        }
        System.out.println("El resultado es : " + resultado);
    }

}