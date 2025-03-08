package main;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainAnemico {
        public static void main(String[] args) {
            TiempoAnemico tiempoAnemico = new TiempoAnemico();
            // formatos
            DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "AR"));
            DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
           //formateamos
            String fechaLarga = tiempoAnemico.getFecha().format(formatoLargo);
            String fechaCorta = tiempoAnemico.getFecha().format(formatoCorto);
           //imprimimos
            System.out.println("Fecha en formato largo: " + fechaLarga);
            System.out.println("Fecha en formato corto: " + fechaCorta);
        }
    }
/*
Tiempo solo tiene datos (fecha), pero no tiene comportamientos Main hace
todo el trabajo (formatea la fecha), lo que rompe la encapsulacion,
si queremos cambiar los formatos, debemos modificar Main, en lugar de la clase que maneja la fecha.
 */
