
package Controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarRegistroVehiculo {
    public void insertar(String modelo,String numero,String velocidad,String color,String ide,String idp) throws SQLException, Exception{
        Conexion cone = new Conexion();
        cone.JavaToMySQL();
        
        String Query = "call IngresoAutos(?,?,?,?,?,?)";

        PreparedStatement insertar = cone.conexion.prepareStatement(Query);

        insertar.setString(1,modelo);
        insertar.setString(2,numero);
        insertar.setString(3,velocidad);
        insertar.setString(4,color);
        insertar.setString(5,ide);
        insertar.setString(6,idp);
        
        insertar.executeUpdate();
    }
}
