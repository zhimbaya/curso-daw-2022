package Tema12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaHabitaciones {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd1", "root", "root");//Al primer parámetro se le llama cadena de conexion
            Statement comando = conexion.createStatement();//Creamos un objeto de la clase Statement (que llevara la sentencia SQL) a partir del objeto conexion creado anterior/
            // definimos una variable de la clase ResultSet llamada registro y llamamos al método executeQuery de la clase Statement del 
            //objeto que acabamos de crear previamente
            //La clase ResultSet lo podemos imaginar como una tabla con todos los datos recuperados del comando SQL select
            ResultSet registro1 = comando.executeQuery("SELECT COUNT(*) FROM habitaciones;");
            int total = 0;
            while (registro1.next()) {
                total = registro1.getInt(1);
            }

            ResultSet registro2 = comando.executeQuery("SELECT COUNT(*) FROM habitaciones WHERE ocupada=1;");
            int ocupaciones = 0;
            while (registro2.next()) {
                ocupaciones = registro2.getInt(1);
            }

            ResultSet registros3 = comando.executeQuery("SELECT COUNT(*) FROM habitaciones WHERE ocupada=0;");
            int libres = 0;
            while (registros3.next()) {
                libres = registros3.getInt(1);
            }

            System.out.println("Habitaciones libres:  " + libres);
            System.out.println("Habitaciones ocupadas:  " + ocupaciones);
            float porcenteje = (float) ocupaciones / total * 100;
            System.out.println("Porcentaje de ocupación: " + String.format("%.2f", porcenteje) + "%");

            registro1.close();
            registro2.close();
            comando.close();
            conexion.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
