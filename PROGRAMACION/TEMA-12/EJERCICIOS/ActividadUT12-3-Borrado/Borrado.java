package Tema12;

import java.sql.*;

public class Borrado {

    public static void main(String[] args) {
        String Nombre, Apellido;
        try {
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd1", "root", "root");
            Statement SentenciaSQL = Conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet Personas = SentenciaSQL.executeQuery("SELECT * FROM DatosPersonales;");

            int registrosEliminados = 0;
            while (Personas.next()) {
                Nombre = Personas.getString("Nombre");
                Apellido = Personas.getString("Apellido");
                if (Apellido.equalsIgnoreCase("Cela") && Nombre.equalsIgnoreCase("Pedro")) {

                    System.out.println("Registro con DNI " + Personas.getString(1) + " eliminado");
                    Personas.deleteRow();
                    registrosEliminados++;
                }
            }
            System.out.println("El nº de registros eliminado es " + registrosEliminados);
            Personas.close();
            Conexion.close();
            SentenciaSQL.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        //Otra forma:
        try {
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd1", "root", "root");
            Statement SentenciaSQL = Conexion.createStatement();
            int registrosBorrados = SentenciaSQL.executeUpdate("DELETE FROM DatosPersonales WHERE UPPER(Nombre) LIKE 'ANA' AND UPPER(Apellido) LIKE 'ROLDÁN';");

            if (registrosBorrados != 0) {
                System.out.println(registrosBorrados + " registro/s borrado/s exitosamente");
            } else {
                System.out.println("No se ha encontrado dicho registro");
            }

            Conexion.close();
            SentenciaSQL.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
