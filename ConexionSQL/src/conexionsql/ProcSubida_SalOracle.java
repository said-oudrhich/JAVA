
package conexionsql;
import java.sql.*;

public class ProcSubida_SalOracle 
{
    
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conexion = DriverManager.getConnection
            ("jdbc:oracle:thin:@//localhost:1521/xe","said", "said");
            //recuperar parametros de main  
            String dep = args[0];	//departamento
            String subida = args[1]; //subida
            //construir orden DE LLAMADA
            String sql = "{ call subida_sal (?, ?) } ";
            // Preparamos la llamada
            CallableStatement llamada = conexion.prepareCall(sql);
            // Damos valor a los argumentos  				 
            llamada.setInt(1, Integer.parseInt(dep));       // primer argumento-dept
            llamada.setFloat(2, Float.parseFloat(subida));  // segundo argumento-subida  					 
            llamada.executeUpdate();  //ejecutar el procedimiento
            System.out.println("Subida realizada ...... ");
            llamada.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//fin de main
    
}//class
