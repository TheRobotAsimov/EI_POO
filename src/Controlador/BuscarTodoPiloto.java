
package Controlador;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class  BuscarTodoPiloto {
    
    public List<String[]> lista;

    // Constructor
    public BuscarTodoPiloto() {
        lista = new ArrayList<>();
    }
    
    public List<String[]> buscar() throws SQLException, Exception{
        Conexion con = new Conexion();
        con.JavaToMySQL();
       
        
        String Query = "select * from piloto";
        
        con.comando = con.conexion.createStatement();
        ResultSet rs = con.comando.executeQuery(Query);
        while(rs.next()){
            String[] dat = {
                rs.getString("idPiloto"),
                rs.getString("nombre"),  
                rs.getString("apellido"),
                rs.getString("peso"),
                rs.getString("nacionalidad"),
                rs.getString("fechaNac"),
                rs.getString("altura"),
                rs.getString("puntos"),
                rs.getString("fechaIngreso"),
                rs.getString("fechaContrato"),
                rs.getString("salario"),
                rs.getString("idEquipo"),
            };
            lista.add(dat);
        }
        return lista;
    }
}
