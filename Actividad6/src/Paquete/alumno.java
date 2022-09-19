package Paquete;

public class alumno {
    private String name;
    private int [] calificaciones;

    public alumno(String name, int [] calificaciones){
        this.name = name;
        this.calificaciones = calificaciones;

    }

    public float datos(){
        int suma=0;
        for (int i=0; i <calificaciones.length; i++){
             suma +=calificaciones[i];
        }
        return suma / calificaciones.length;
    }
    public String calificacion(){
        float a = this.datos();
        if (a<50){
            return "F";
        } else if (a < 60) {
            return "E";
        } else if (a < 70) {
            return "D";
        } else if (a < 80) {
            return "C";
        } else if (a < 90) {
            return "B";
        } else if (a < 100) {
            return "A";
        }
        return "a";
    }
    private void printcalificaciones(){
        for (int i=0; i < calificaciones.length; i++) {
            System.out.println("Calificacion" + (i + 1) + ": " + calificaciones[i]);
            }
        }
    public void print() {
            System.out.println("Nombre del Alumno" + this.name);
            this.printcalificaciones();
            System.out.println("Promedio" + this.datos());
            System.out.println("Calificacion:" + this.calificacion());
        }
    }

