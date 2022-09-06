package Paquete;
import java.util.Scanner;
public class Calculadora1 {
    public static void main(String[] args) {

        operaciones dato = new operaciones ();
        Scanner entrada = new Scanner(System. in);
        int n1, n2, resultado, opcion;
        boolean op = true;
        while (op) {
            System.out.println("HOLA QUE OPERACION DESEAS REALIZAR?");
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.MODULAR");
            System.out.println("6.SALIR");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            if (opcion == 6){
                System.out.println("Finalizado");
                break;
            }else {
                switch (opcion) {
                    case 1:
                        System.out.print("Igresa el primer valor:  ");
                        n1 = entrada.nextInt();
                        System.out.print("Igresa el segundo valor:  ");
                        n2 = entrada.nextInt();
                        resultado = dato.sumar(n1,n2);
                        System.out.println("El resultado de la suma es:  " + resultado);
                        break;
                    case 2:
                        System.out.print("Igresa el primer valor:  ");
                        n1 = entrada.nextInt();
                        System.out.print("Igresa el segundo valor:  ");
                        n2 = entrada.nextInt();
                        resultado = dato.restar(n1,n2);
                        System.out.println("El resultado de la resta es:  " + resultado);
                        break;
                    case 3:
                        System.out.print("Igresa el primer valor:  ");
                        n1 = entrada.nextInt();
                        System.out.print("Igresa el segundo valor:  ");
                        n2 = entrada.nextInt();
                        resultado = dato.multiplicar(n1,n2);
                        System.out.println("EL resultado de la multipicacion es:  " + resultado);
                        break;
                    case 4:
                        System.out.print("Igresa el primer valor:  ");
                        n1 = entrada.nextInt();
                        System.out.print("Igresa el segundo valor:  ");
                        n2 = entrada.nextInt();
                        resultado = dato.dividir(n1,n2);
                        System.out.println("El resultado de la  division es:  " + resultado);
                        break;
                    case 5:
                        System.out.print("Igresa el primer valor:  ");
                        n1 = entrada.nextInt();
                        System.out.print("Igresa el segundo valor:  ");
                        n2 = entrada.nextInt();
                        resultado = dato.modular(n1,n2);
                        System.out.println("El resultado de la  modulacion es:  " + resultado);
                        break;
                    default:
                        System.out.print("Opcion incorrecta");
                }
            }

        }


    }
}
