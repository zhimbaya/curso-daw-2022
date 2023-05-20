package Tema12;

import java.sql.*;

public class Insercion {

    public static void main(String[] args) {
        
        try {
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd1", "root", "root");
            Statement SentenciaSQL = Conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet Personas = SentenciaSQL.executeQuery("SELECT * FROM DatosPersonales;");

            Personas.moveToInsertRow();
            Personas.updateString("DNI", "10809978J");
            Personas.updateString(2, "Ana Maria");
            Personas.updateString("Apellido", "Roldán");
            Personas.updateInt("Edad", 27);
            Personas.insertRow();

            Personas.close();
            SentenciaSQL.close();
            Conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }

        //Otra forma:

        try {
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd1", "root", "root");
            Statement SentenciaSQL = Conexion.createStatement();
            SentenciaSQL.executeUpdate("INSERT INTO DatosPersonales VALUES('03349901Z', 'José Miguel', 'Peret Morales', 14);");
            System.out.println("OK");
            SentenciaSQL.close();
            Conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
