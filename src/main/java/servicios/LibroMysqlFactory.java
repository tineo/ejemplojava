package servicios;

import java.sql.*;

import entity.*;

/**
 * Created by CARLOS on 26/02/2017.
 */
public class LibroMysqlFactory {

    private static Connection miCon;

    public static Libro obtener(String id_libro){
        PreparedStatement stringStatement = null;
        Libro retornar = null;
        try{
            miCon = Conexion.getConexion();
            stringStatement = miCon.prepareStatement("SELECT * FROM libros WHERE codlib = ?");
            stringStatement.setString(1,id_libro);
            ResultSet rs = stringStatement.executeQuery();
            retornar = new Libro();
            if(rs.next()){
                retornar.setAutor(rs.getString("autor"));
                retornar.setId_libro(rs.getString("codlib"));
                retornar.setEditorial(rs.getString("editorial"));
                retornar.setNombre(rs.getString("nomlib"));
                retornar.setPais(rs.getString("pais"));
            }
            miCon.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return retornar;
    }

}
