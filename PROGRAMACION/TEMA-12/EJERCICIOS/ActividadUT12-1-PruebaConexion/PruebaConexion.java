package Tema12;

import java.sql.*;

public class PruebaConexion {

    public static void main(String[] args) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd1", "root", "root");
            Statement SentenciaSQL = Conexion.createStatement();
            ResultSet Personas = SentenciaSQL.executeQuery("SELECT * FROM datospersonales"); //No procesaremos los datos de esta consulta
            while (Personas.next()) {
                System.out.println(Personas.getString(1) + " "
                        + Personas.getString(2) + " "
                        + Personas.getString(3) + " "
                        + Personas.getString(4));
            }
            Personas.close();
            SentenciaSQL.close();
            Conexion.close();
            System.out.println("Sin error al conectar");  //Si llega aquí, no habrá habido error de conexón a la base de datos

        } catch (SQLException e) {
            System.out.println("Fallo: " + e.getMessage());
            System.out.println("Fallo: " + e.getErrorCode());
        }

    }

}
