
package conexionsql;

import java.sql.*;
public class DMLInsertDeptPrep 
{
    public static void main(String[] args) {
        try {
            //Cargar el driver
            Class.forName("oracle.jdbc.OracleDriver");
            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection
            ("jdbc:oracle:thin:@//localhost:1521/xe","said", "said");
            //recuperar parametros de main  
            String deptno = args[0];
            String dname = args[1];
            String loc = args[2];
            //construir orden INSERT
            String sql = "INSERT INTO dept VALUES ( ?, ?, ?)";
            System.out.println(sql);
            // Preparamos la sentencia
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, Integer.parseInt(deptno));
            sentencia.setString(2, dname);
            sentencia.setString(3, loc);

            int filas = sentencia.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            // Cerrar Statement
            sentencia.close();
            //Cerrar conexion
            conexion.close();
        } catch (ClassNotFoundException cn) {
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//fin de main
    
}//Class
