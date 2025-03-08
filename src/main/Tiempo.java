package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tiempo {
    private LocalDate fecha;

    public Tiempo() {
        this.fecha = LocalDate.now();
    }

    public String obtenerFechaFormatoLargo() {
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "AR"));
        return fecha.format(formatoLargo);
    }

    public String obtenerFechaFormatoCorto() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatoCorto);
    }
}
/*
Tiempo no solo almacena la fecha, sino que contiene la lógica para formatearla.
Main ahora simplemente usa Tiempo, sin preocuparse por cómo se hace el formateo.
Si en el futuro queremos cambiar los formatos, solo editamos Tiempo
Esto respeta la Encapsulación, ya que la lógica está  en el objeto que la necesita.
 */

