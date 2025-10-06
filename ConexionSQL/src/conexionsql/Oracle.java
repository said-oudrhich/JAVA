
package conexionsql;
import java.sql.*;

public class Oracle 
{
     public static void main(String[] args) 
    {
        try
        {
            //cargar el driver
            Class.forName("oracle.jdbc.OracleDriver");

           //Class.forName("oracle.jdbc.driver.OracleDriver")
            //Para version de netbeans 8.0 poner
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            //Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection
            ("jdbc:oracle:thin:@//localhost:1521/xe","said", "said");

            // Connection conexion = DriverManager.getConnection
            // ("jdbcoracle:thin:@localhost:1521:XE","antonio", "antonio");
            //preparamos la consulta
            Statement sentencia = conexion.createStatement();
            
            
            
            //Consulta 1-------------------------------
            ResultSet resul = sentencia.executeQuery(
                    "select e.ename, e.sal, d.dname, d.loc "
                    + "from emp e "
                    + "join dept d on e.deptno = d.deptno "
                    + "where e.sal >= 1400"
            );
            
            while (resul.next()) {
            String nombre = resul.getString("ename");
            double salario = resul.getDouble("sal");
            String departamento = resul.getString("dname");
            String localidad = resul.getString("loc");

            System.out.println(nombre + " | " + salario + " | " + departamento + " | " + localidad);
            }//---------------------------------------------------------------------------
            


          /*  
            ResultSet resul = sentencia.executeQuery("select * from emp");
            
            //Recorremos el resultado para visualizar cada fila
            //Se hace un bucle mientras haya registros, se van visualizando
            
            while (resul.next())
            {
            System.out.println(resul.getInt(1)+" "
            + " "+resul.getString(2)+" "+resul.getString(3));
            } 

            resul.close();//cerrar ResultSet
            sentencia.close();//Cerrar Statement
            conexion.close(); //Cerrar Conexion */

        }
        catch(ClassNotFoundException cn) 
        {
            cn.printStackTrace();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//main

     
}//class
