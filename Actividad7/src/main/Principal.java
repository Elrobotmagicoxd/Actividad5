package main;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int num;
        System.out.print("Hola porfavor digita Un numero para calcular las series numericas de los numeros primos y fibonaci: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        Numeros_Primos primo = new Numeros_Primos(num);
        primo.IdentificarPrimos();
        primo.mostrarArreglo();

        Fibonacci fibonacci = new Fibonacci(num);
        fibonacci.llenar();
        fibonacci.mostrarArreglo();

    }
}

