package servicios;

import java.sql.*;

/**
 * Created by CARLOS on 26/02/2017.
 */
public class Conexion {

    private static String usuario = "root";
    private static String pass = "diana";
    private static String connectionString = "jdbc:mysql://localhost/biblioteca?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private static Connection miCon = null;

    public static Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance( );
            miCon = DriverManager.getConnection(connectionString,usuario,pass);
            return miCon;
        }catch(Exception e){
            e.printStackTrace();
            return miCon;
        }
    }
}
