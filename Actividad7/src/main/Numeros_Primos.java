package main;

public class Numeros_Primos {
    int datos;
    int[] numero;

    public Numeros_Primos(int datos) {
        this.datos = datos;
    }

    public void IdentificarPrimos() {

        numero = new int[datos];
        int i = 1;
        int limite = 0;
        while(datos != limite){
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                numero [limite] = i;
                limite++;
            }
            i++;


        }
    }

    public void mostrarArreglo(){
        System.out.println("Numeros primos");
        for (int n : numero){
            System.out.print(n + ",");
        }
    }
}
