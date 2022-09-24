package main;

public class Fibonacci {
    int datos = 0;
    int []arreglodedatos;

    public Fibonacci(int datos) {
        this.datos = datos;
    }

    public void llenar(){
        arreglodedatos = new int[datos];
        int cont = 0;
        arreglodedatos [0] = 0;
        arreglodedatos [1] = 1;

        for (int i = 2; i <datos; i++){
            arreglodedatos [ i ] = arreglodedatos [i-2] + arreglodedatos[i - 1];
        }
        System.out.println(cont);
    }

    public void mostrarArreglo(){
        System.out.println( "Fibonacci" );

        for (int n : arreglodedatos){
            System.out.print( n + "," );
        }
    }
}
