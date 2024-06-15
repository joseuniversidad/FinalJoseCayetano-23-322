import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, Bienvenido al programa de Ejercicios");
        int ingresado;

            Scanner opc = new Scanner(System.in);
            System.out.println("Selecciona que Ejercicio desea realizar");
            System.out.println("1. Metodo de los Parametros ");
            System.out.println("2. Metodo Tabla de Multiplicar");
            System.out.println("3. Metodo de Numeros y Operador");
            System.out.println("4. Metodo Determinar si es Primo o No");
            System.out.println("5. ");
            ingresado = opc.nextInt();
            switch (ingresado) {
                case 1:
                    System.out.println("Ingrese te tipos de textos");
                    break;
                case 2:
                    System.out.println("Ingrese un numero para realiza tabla de multiplicar");
                    break;
                case 3:
                    System.out.println("Ingrese un 2 Numeros y un Operador");
                    break;
                case 4:
                    System.out.println("Ingrese 2 Numeros para determinar si es Primo o No");
                    break;


            }

    }
}