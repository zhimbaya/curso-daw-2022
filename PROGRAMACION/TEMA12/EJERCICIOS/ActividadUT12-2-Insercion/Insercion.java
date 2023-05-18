import java.sql.*;

public class Insercion {

  public static void main(String[] args){
    try{
     Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
     Statement SentenciaSQL = Conexion.createStatement(
       ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
     ResultSet Personas = SentenciaSQL.executeQuery("SELECT * FROM DatosPersonales");

     Personas.moveToInsertRow();
     Personas.updateString("DNI","10809978M");
     Personas.updateString(2,"Ana");
     Personas.updateString("Apellido","Roldán"); 
     Personas.updateInt("Edad",27);
     Personas.insertRow();

     Personas.close();
     SentenciaSQL.close();
     Conexion.close();
    }
    catch (SQLException e) {
      System.out.println(e);
    }    
    
    
    //Otra forma:
    try{
        Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
        Statement SentenciaSQL = Conexion.createStatement();
        SentenciaSQL.execute("INSERT INTO DatosPersonales VALUES('02349901R', 'José Miguel', 'Peret Morales', 12);");

        SentenciaSQL.close();
        Conexion.close();
       }
       catch (SQLException e) {
         System.out.println(e);
       }    
  }

}