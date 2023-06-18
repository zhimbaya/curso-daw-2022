package Tema07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 *
 * @author diego
 */
public class _01PersonaTest {

    /**
     * Ejemplo de uso de clases abstractas y métodos abstractos
     */
    public static void main(String[] args) {
        // Declaración de objetos de las clases _01Persona, _01Profesor y _01Alumno _01Persona pers1, pers2;
        _01Alumno al1;
        _01Alumno al2;
        _01Profesor prof1;
        _01Profesor prof2;
        //pers1= new _01Persona (); // Error: una clase abstracta no puede ser instanciada

        al1 = new _01Alumno("Juan", "Torres", new GregorianCalendar(1990, 10, 6), "DAW", 7.5);
        prof1 = new _01Profesor("Antonio", "Campos", new GregorianCalendar(1970, 8, 15), "Electricidad", 2000);

        // Llamada a métodos abstractos en la clase _01Persona
        // Pero heredados y definidos en las clases _01Profesor y en Alummno al1.mostrar();
        prof1.mostrar();
        al1.mostrar2();

        String stringContenidoAlumno, stringContenidoProfesor;
        Hashtable hashtableContenidoAlumno, hashtableContenidoProfesor;
        ArrayList listaContenidoAlumno, listaContenidoProfesor;
        // Creación de objetos alumno y profesor
        _01Alumno al3 = new _01Alumno("Juan", "Torres Mula", new GregorianCalendar(2023, 01, 6), "DAW", 7.5);
        _01Profesor prof3 = new _01Profesor("Antonio", "Campos Pin", new GregorianCalendar(2023, 8, 15), "Informática", 2000);

        // Obtención del contenido del objeto alumno a través de los métodos del interfaz Imprimible
        stringContenidoAlumno = al3.devolverContenidoString();
        hashtableContenidoAlumno = al3.devolverContenidoHashtable();
        listaContenidoAlumno = al3.devolverContenidoArrayList();
        // Obtención del contenido del objeto profesor a través de los métodos del interfaz Imprimible
        stringContenidoProfesor = prof3.devolverContenidoString();
        hashtableContenidoProfesor = prof3.devolverContenidoHashtable();
        listaContenidoProfesor = prof3.devolverContenidoArrayList();

        // Impresión en pantalla del contenido del objeto alumno a través de las estructuras obtenidas
        System.out.printf("Contenido del objeto alumno: %s\n", stringContenidoAlumno);
        // Impresión en pantalla del contenido del objeto alumno a través de las estructuras obtenidas
        System.out.printf("Contenido del objeto profesor: %s\n", stringContenidoProfesor);

        //------
        String stringContenidoUsuario;
        String nombre = null, apellidos = null, tipo = null;
        _01Persona usuario = null;
        GregorianCalendar fecha = null;
        // PRESENTACIÓN
        // ------------
        System.out.printf("PRUEBA DE USO DEl POLIMORFISMO Y LA LIGADURA DINÁMICA. \n");
        System.out.printf("------------------------------------------------------\n\n");
        // ENTRADA DE DATOS
        // ----------------
        // Nombre
        System.out.print("Nombre del usuario: ");

        try {
            nombre = lecturaTeclado();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        // Apellidos
        System.out.print("Apellidos del usuario: ");
        try {
            apellidos = lecturaTeclado();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // Fecha de nacimiento
        boolean fechaValida = true;
        do {
            String stringFecha = null;
            SimpleDateFormat formatoFecha = null;
            Date dateFecha = null;
            System.out.print("Fecha de nacimiento del usuario (formato DD/MM/AAAA): ");
            try {
                stringFecha = lecturaTeclado();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            // Conversión del texto en fecha
            formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            try {
                dateFecha = formatoFecha.parse(stringFecha);
            } catch (ParseException e) {
                fechaValida = false;
            }
            fecha = new GregorianCalendar();
            fecha.setTime(dateFecha);
        } while (!fechaValida);

        // ¿_01Alumno o _01Profesor? 
        do {
            System.out.println("¿Es alumno(A) o profesor(P)?");
            try {
                tipo = lecturaTeclado();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            if (tipo.equals("P") || tipo.equals("p")) {
                tipo = "profesor";
            } else if (tipo.equals("A") || tipo.equals("a")) {
                tipo = "alumno";
            } else {
                tipo = "X";
            }
        } while (tipo.equals("X"));

        // Creación del objeto usuario (desconocido en tiempo de compilación)
        // Sabemos que será subclase de _01Persona, pero no sabemos si será _01Alumno o _01Profesor 
        // (dependerá de la ejecución)
        if (tipo.equals("profesor")) {
            usuario = new _01Profesor(nombre, apellidos, fecha);
        } else if (tipo.equals("alumno")) {
            usuario = new _01Alumno(nombre, apellidos, fecha);
        } else {
        }

        // Obtención del contenido del objeto usuario a través del método devolverContenidoString.
        // El método que se va a ajecutar aún no se sabe cuál es (ligadura dinámica), pues
        // este objeto usuario no sabemos si será _01Alumno o _01Profesor. Tan solo sabemos que será de la // superclase _01Persona. En tiempo de ejecución se sabrá de qué tipo de subclase se trata y será // también en ese momento cuando el entorno de ejecución pueda resolver qué método se ejecuta // (el de método devolverContenidoString de la clase _01Alumno o el de la clase _01Profesor)
        stringContenidoUsuario = usuario.devolverContenidoString();
        // Impresión en pantalla del contenido del objeto usuario a través de la estructura obtenida 
        System.out.printf("Contenido del objeto usuario: %s\n", stringContenidoUsuario);
    }
    //--------------------------------------------------------------- 
    // MÉTODO lecturaTeclado: Captura de una cadena de teclado 
    //--------------------------------------------------------------- 

    private static String lecturaTeclado() throws Exception {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            return line;
        } catch (Exception e) {
            throw e;
        }
    }

}
