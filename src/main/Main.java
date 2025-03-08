package main;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();

  //imprimimos
        System.out.println("Fecha en formato largo: " + tiempo.obtenerFechaFormatoLargo());
        System.out.println("Fecha en formato corto: " + tiempo.obtenerFechaFormatoCorto());
    }
}
/*
Tiempo no solo almacena la fecha, sino que contiene la lógica para formatearla.
Main ahora simplemente usa Tiempo, sin preocuparse por cómo se hace el formateo.
Si en el futuro queremos cambiar los formatos, solo editamos Tiempo, no Main.
Esto respeta el principio de Encapsulación, ya que la lógica está dentro del objeto que la necesita.
 */