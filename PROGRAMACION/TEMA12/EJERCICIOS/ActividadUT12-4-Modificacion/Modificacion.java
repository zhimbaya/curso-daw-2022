import java.sql.*;

public class Modificacion {

  public static void main(String[] args){
    String Nombre,Apellido,DNI;
    int Edad;
    try{
     Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
     Statement SentenciaSQL = Conexion.createStatement(
       ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
     ResultSet Personas = SentenciaSQL.executeQuery("SELECT * FROM DatosPersonales");
     
     int registrosActualizados=0;
     while (Personas.next()) {
       Nombre = Personas.getString("Nombre");
       Apellido = Personas.getString("Apellido");
       if (Apellido.equalsIgnoreCase("Neruda Ripollés") && Nombre.equalsIgnoreCase("Pedro")){
         // IMPORTANTE: por cada campo a actualzar hay que realizar
         //             un updateXxxxx("Campo")
    	  //Si solo actualizo los apellidos, entonces los demás campos no son necesarios especificarse
         //Personas.updateString("Nombre","Pedro");
         Personas.updateString("Apellido","Neruda Ripoll");
         //Personas.updateInt("Edad",58);
         //Personas.updateString("DNI","002334189S");
         Personas.updateRow();
         registrosActualizados++;
       }
     }
     System.out.println("Se han actualizado " + registrosActualizados + " registro/s");

     Personas.close();
     Conexion.close();
     SentenciaSQL.close();
    }
    catch (SQLException e) {
      System.out.println(e);
    }    
    
    
    //Otra forma:
    try{
        Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
        Statement SentenciaSQL = Conexion.createStatement();
        int registrosActualizados=SentenciaSQL.executeUpdate("UPDATE DatosPersonales SET Apellido='López Sanguino' WHERE UPPER(Apellido) LIKE 'LÓPEZ SANJUAN' AND UPPER(Nombre) LIKE 'ROSA';");
        
        System.out.println("Se han actualizado " + registrosActualizados);
        Conexion.close();
        SentenciaSQL.close();
       }
       catch (SQLException e) {
         System.out.println(e);
       }    
  }

}