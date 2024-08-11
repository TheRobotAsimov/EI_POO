
package Controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarRegistroPiloto {
    public void insertar(String nombre,String apellido,String peso,String nacionalidad,String anio,String mes,String dia,String altura,String ide) throws SQLException, Exception{
        Conexion cone = new Conexion();
        cone.JavaToMySQL();
        
        String fecha = anio+"-"+mes+"-"+dia;
        String Query = "call insertarPiloto(?,?,?,?,?,?,?)";

        PreparedStatement insertar = cone.conexion.prepareStatement(Query);

        insertar.setString(1,nombre);
        insertar.setString(2,apellido);
        insertar.setString(3,peso);
        insertar.setString(4,nacionalidad);
        insertar.setString(5,fecha);
        insertar.setString(6,ide);
        insertar.setString(7,altura);
        
        insertar.executeUpdate();
    }
}
