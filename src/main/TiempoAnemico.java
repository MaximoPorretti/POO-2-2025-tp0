package main;

import java.time.LocalDate;

public class TiempoAnemico {
    private LocalDate fecha=LocalDate.now();
    public LocalDate getFecha()
    {
        return fecha;
    }
}
/*
Tiempo solo tiene datos (fecha), pero no tiene ning&uacute;n comportamiento.
Main hace todo el trabajo (formatea la fecha), lo que rompe la encapsulaci&oacute;n.
Si queremos cambiar los formatos, debemos modificar Main, en lugar de la clase que maneja la fecha.

 */
