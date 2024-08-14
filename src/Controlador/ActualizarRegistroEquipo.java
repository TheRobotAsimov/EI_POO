
package Controlador;
import java.sql.PreparedStatement;

public class ActualizarRegistroEquipo {
    public void actualizar(String[] datosEquipo) throws Exception{
    
        Conexion cone = new Conexion();
        cone.JavaToMySQL();
        
        String Query = "update equipo set marca=?,director=?,nacionalidadEquipo=?,cantNeuma=? where idequipo = ?";
        
        PreparedStatement actualizar = cone.conexion.prepareStatement(Query);
        
        for(int i=1;i<datosEquipo.length;i++){
            actualizar.setString(i,datosEquipo[i]);
                
        }
        actualizar.setString(datosEquipo.length,datosEquipo[0]);
        actualizar.executeUpdate();
    }
    
}
