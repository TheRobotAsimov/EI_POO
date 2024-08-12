
package Controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarRegistroEquipo {
       public void insertar(String marca,String director,String nacionalidad) throws SQLException, Exception{
        Conexion cone = new Conexion();
        cone.JavaToMySQL();
        
        String Query = "call EquiposIn(?,?,?)";

        PreparedStatement insertar = cone.conexion.prepareStatement(Query);

        insertar.setString(1,marca);
        insertar.setString(2,director);
        insertar.setString(3,nacionalidad);
        
        insertar.executeUpdate();
    } 
}
