import java.sql.*;

public class PruebaConexion {

  public static void main(String[] args){
    try{
     //Class.forName("com.mysql.jdbc.Driver");
     Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
     Statement SentenciaSQL = Conexion.createStatement();
     ResultSet Personas = SentenciaSQL.executeQuery("SELECT * FROM DatosPersonales"); //No procesaremos los datos de esta consulta

     Personas.close();
     Conexion.close();
     SentenciaSQL.close();
     System.out.println("Sin error al conectar");  //Si llega aquí, no habrá habido error de conexón a la base de datos

    }
    catch (SQLException e) {
      System.out.println(e);
    }  

  }

}