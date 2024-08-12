
package Controlador;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class  BuscarTodoVehiculo {
    
    public List<String[]> lista;

    // Constructor
    public BuscarTodoVehiculo() {
        lista = new ArrayList<>();
    }
    
    public List<String[]> buscar() throws SQLException, Exception{
        Conexion con = new Conexion();
        con.JavaToMySQL();
       
        
        String Query = "select * from vehiculo";
        
        con.comando = con.conexion.createStatement();
        ResultSet rs = con.comando.executeQuery(Query);
        while(rs.next()){
            String[] dat = {
                rs.getString("idVehiculo"),
                rs.getString("modelo"),  
                rs.getString("numero"),
                rs.getString("peso"),
                rs.getString("velocidadMax"),
                rs.getString("color"),
                rs.getString("idEquipo"),
                rs.getString("idPiloto")
            };
            lista.add(dat);
        }
        return lista;
    }
}
