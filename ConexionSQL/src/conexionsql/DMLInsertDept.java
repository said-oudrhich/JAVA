
package conexionsql;
import java.sql.*;

public class DMLInsertDept 
{
    
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");//Cargar el driver
            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection
            ("jdbc:oracle:thin:@//localhost:1521/xe","said", "said");
            //recuperar argumentos de main  
            String deptno = args[0]; // num. departamento
            String dnombre = args[1]; // nombre
            String loc = args[2];	   // localidad

            //construir orden INSERT
            String sql = "INSERT INTO DEPT VALUES "
                    + "(" + deptno + ",'" + dnombre + "','" + loc + "')";
            System.out.println(sql);
            Statement sentencia = conexion.createStatement();
            int filas = sentencia.executeUpdate(sql);
            System.out.println("Filas afectadas: " + filas);

            sentencia.close();  	     // Cerrar Statement
            conexion.close();   	     //Cerrar conexion		  	   
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//fin de main
    
    
}//Class
