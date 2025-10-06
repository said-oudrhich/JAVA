
package conexionsql;
import java.sql.*;

public class verEmpleado 
{
    
    public static void main(String[] args) {
        try {

            //Cargar el driver
            Class.forName("oracle.jdbc.OracleDriver");
            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection
            ("jdbc:oracle:thin:@//localhost:1521/xe","said", "said");
            //recuperar parametros de main
            
            

            //System.out.println(args.length);
            String dept = args[0];//departamento
            String oficio = args[1]; //oficio			
            //construir orden UPDATE
            String sql = "SELECT ENAME, SAL FROM emp"
                    + " WHERE deptno=? AND JOB=? ORDER BY 1";
            //String sql= "SELECT apellido, salario FROM emp"
            //+ " WHERE deptno="+dept+" AND oficio= '"+oficio+"' ORDER BY 1";

            // Preparamos la sentencia
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, Integer.parseInt(dept));
            sentencia.setString(2, oficio);
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("ENAME") + " => "
                        + rs.getFloat("SAL"));
            }

            rs.close();
            sentencia.close();// Cerrar Statement
            conexion.close();  //Cerrar conexion

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        //PARA QUE FUNCIONE -> CLIC DERECHO PROYECTO -> SET CONFIGURATION ->  CUSTOMIZE
        // -> RUN (Apartado) -> MAINCLASS "NombreDelArchivo" y ARGUMENTS "30" "SALESMAN" -> OK -> RUN ENCIMA DEL PROYECTO

    }//Main
    
}//class
