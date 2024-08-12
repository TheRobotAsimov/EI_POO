
package Controlador;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarTodoEquipo {
       public List<String[]> lista;

    // Constructor
    public BuscarTodoEquipo() {
        lista = new ArrayList<>();
    }
    
    public List<String[]> buscar() throws SQLException, Exception{
        Conexion con = new Conexion();
        con.JavaToMySQL();
       
        
        String Query = "select * from equipo";
        
        con.comando = con.conexion.createStatement();
        ResultSet rs = con.comando.executeQuery(Query);
        while(rs.next()){
            String[] dat = {
                rs.getString("idEquipo"),
                rs.getString("marca"),  
                rs.getString("director"),
                rs.getString("nacionalidadEquipo"),
                rs.getString("cantNeuma")
            };
            lista.add(dat);
        }
        return lista;
    } 
}
