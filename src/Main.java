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
            System.out.println("5. Estudiante con get y set");
            System.out.println("Arrays Con estudiante");
            ingresado = opc.nextInt();
            switch (ingresado) {
                case 1:
                    System.out.println("Ingrese te tipos de textos");
                    Scanner texto = new Scanner(System.in);
                    System.out.println("Escriba el primero texto");
                    String texto1 = texto.nextLine();
                    System.out.println("Escriba el segundo texto");
                    String texto2 = texto.nextLine();
                    System.out.println("Escriba el  texto");
                    String texto3 = texto.nextLine();

                    Parametros parametros = new Parametros(texto1, texto2, texto3);
                    parametros.concatenacion();
                    break;
                case 2:
                    System.out.println("Ingrese un numero para realiza tabla de multiplicar");
                    Scanner receive1 = new Scanner(System.in);
                    System.out.print("Ingresa un número: ");
                    int Leer2 = receive1.nextInt();

                    Multiplicacion tabla = new Multiplicacion(Leer2);
                    tabla.mostrarTabla();
                    break;
                case 3:
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Ingrese el primer numero: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    double num2 = scanner.nextDouble();

                    System.out.print("Ingresa un operador (+, -, *, /): ");
                    char op = scanner.next().charAt(0);

                    aritmeticoCalculador operadora = new aritmeticoCalculador (num1, num2, op);
                    operadora.verificacion();

                    scanner.close();

                    break;
                case 4:
                    System.out.println("Ingrese un Numero para determinar si es Primo o No");
                    Scanner receive3 = new Scanner(System.in);
                    System.out.println("Ingresa el numero");
                    int Leer5 = receive3.nextInt();

                    NumeroPrimo tabla3 = new NumeroPrimo(Leer5);
                    tabla3.verficacion();

                    break;
                case 5:
                    Estudiante estudiante1 = new Estudiante("Jose Cayetano");
                    System.out.println("Nombre del estudiante: " + estudiante1.getNombre());
                    System.out.println("Clasificación: " + estudiante1.getClasificacion());
                    break;
                case 6:
                    System.out.println("Almacenando Estudiantes en Arrays");
                    Estudiante[] listaEstudiantes = new Estudiante[5];
                    listaEstudiantes[0] = new Estudiante("Ana");
                    listaEstudiantes[1] = new Estudiante("Luis");
                    listaEstudiantes[2] = new Estudiante("Carlos");
                    listaEstudiantes[3] = new Estudiante("Maria");
                    listaEstudiantes[4] = new Estudiante("Jose");

                    GestorEstudiantes2 gestor = new GestorEstudiantes2(listaEstudiantes);
                    gestor.mostrarEstudiantes2();



            }
    }


}


